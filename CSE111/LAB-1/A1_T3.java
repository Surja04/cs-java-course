//Task3
import java.util.Scanner;
public class A1_T3
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    String str1 = input.nextLine();
    String str2 = input.nextLine();
    String new_word = str1+" "+str2;
    int sum = 0;
    for(int i = 0; i < new_word.length(); i++ )
    {
      char ch = new_word.charAt(i);
      int ascii = (int) ch ;
//      sum = sum+ascii;
      if(ascii>=65 && ascii <= 122)
      {
        sum = sum+ascii;
      }
    }
    System.out.print(sum);
  }
}