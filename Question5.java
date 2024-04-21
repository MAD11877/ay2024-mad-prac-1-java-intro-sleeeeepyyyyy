import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        
        int[] numbers = new int[count];
        
        int mode = 0;
        int maxCount = 0;
        int[] seenNumbers = new int[101]; 
    
        for (int i = 0; i < count; i++) {
            int num = in.nextInt();
            seenNumbers[num]++; 

            if (seenNumbers[num] > maxCount) {
                maxCount = seenNumbers[num];
                mode = num;
            }
        }
        System.out.println(mode);
  }
}
