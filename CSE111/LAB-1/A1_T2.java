//Task2
import java.util.Scanner;
public class A1_T2
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int count = 0;
    boolean isPrime = true;
    for(int i = num1; i <= num2; i++)
    {
      isPrime = true;
      for(int j = 2; j < i; j++ )
      {
        if(i%j == 0)
        {
          isPrime = false;
          break;
        }

      }
      if(isPrime)
      {
        count++;
      }
    }
    System.out.print("There are " +count+ " prime numbers between 10 and 15.");
  }

}