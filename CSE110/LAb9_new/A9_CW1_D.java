import java.util.Scanner;
public class A9_CW1_D{
  public static void main(String[]args){
      sequence(-7);
  }
  public static void sequence(int n){
//      Scanner input = new Scanner (System.in);
//      n = input.nextInt();
      if(isPos(n))
      {
        for(int i = 0; i <= n; i++)
        {
          if(isEven(i))
          {
             System.out.print(i+",");
          }
        }
      }
      else if(!isPos(n))
      {
          for(int i = n; i <= -1; i++)
          {
            if(!isEven(i))
            {
              System.out.print(i+" ");
            }
          }
      }
     
        
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