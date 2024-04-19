import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] inputs = getUserInputs(in);
        double bmi = calculateBMI(inputs[0], inputs[1]);
        System.out.println("Your BMI is: " + bmi);
        in.close();
    }

    static double[] getUserInputs(Scanner scanner) {
        System.out.print("Enter your height in meters (m): ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = scanner.nextDouble();
        
        return new double[]{height, weight};
    }

    static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
