public class digit_finding
{
  public static void main(String [] args)
  {
    int num = 1234;
    int last_digit = num%10;
    int temp = num/10;
     int second_last_digit = temp%10;
     System.out.print(last_digit+" "+second_last_digit);
  }
}