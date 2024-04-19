import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double height = getUserInput(in, "Enter your height in meters (m): ");
        double weight = getUserInput(in, "Enter your weight in kilograms (kg): ");
        
        double bmi = calculateBMI(height, weight);
        
        System.out.println("Your BMI is: " + bmi);
        in.close();
    }
    
    static double getUserInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    
    static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}

