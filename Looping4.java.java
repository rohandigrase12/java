import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

      int sum = 0;

      for (int i = 1; i <= 3; i++) {
         System.out.print("Enter number " + i + ": ");
         int number = input.nextInt();
         sum = number;
      }

      double average = sum / 3.0;

      System.out.println("Sum of the numbers is: " + sum);
      System.out.println("Average of the numbers is: " + average);
   }
}