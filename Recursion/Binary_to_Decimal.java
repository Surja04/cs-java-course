public class Binary_to_Decimal
{
  public static void main(String [] args)
  {
    String s = "";
    int num = 10;
    String result = binaryTodecimal(num,s);
    System.out.println(result);
    
  }
  public static String binaryTodecimal(int n, String s)
  {
    if(n == 0)
    {
      return s;
    }
    int i = n%2;
    n = n/2;     
    s = binaryTodecimal(n,s)+Integer.toString(i);    
    return s;
    
  }
}