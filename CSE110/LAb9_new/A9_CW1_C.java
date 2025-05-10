import java.util.Scanner;
public class A9_CW1_C
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();    
    boolean result = isPos(n);
    System.out.print(result);
  }
  public static boolean isPos (int num)
  {
    boolean is_pos = false;
    if(num > 0)
    {
       is_pos = true;        
    }
    else
    {
       is_pos = false;
    }
    return is_pos;
  }
}