import java.util.Scanner;
public class A9_CW1_B
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();    
    boolean result = isEven(n);
    System.out.print(result);
  }
  public static boolean isEven (int num)
  {
    boolean is_even = false;
    if(num%2 == 0)
    {
       is_even = true;        
    }
    else
    {
       is_even = false;
    }
    return is_even;
  }
}