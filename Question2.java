import java.util.Scanner;

public class Question2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your height in meters (m): ");
        double height = in.nextDouble(); 
        
        System.out.println("Enter your weight in kilograms (kg): ");
        double weight = in.nextDouble(); 
        
        double bmi = weight / (height * height); 
        
        System.out.println(bmi);
        
        in.close(); 
    }
}

