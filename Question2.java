import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter your height in meters (m): ");
    double height = in.nextDouble();
    
    System.out.print("Enter your weight in kilograms (kg): ");
    double weight = in.nextDouble();
    
    double bmi = weight / (height * height);
    
    System.out.println("Your BMI is: ");
    in.close();
  }
}
