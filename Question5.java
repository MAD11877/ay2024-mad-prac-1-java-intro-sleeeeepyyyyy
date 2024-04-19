import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of integers:");
        int count = in.nextInt();
        
        int[] numbers = new int[count];
        
        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }
        
        int mode = findMode(numbers);
        System.out.println("The mode is: " + mode);
    }
}
