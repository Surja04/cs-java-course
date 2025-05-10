//Task4
import java.util.Scanner;
public class A1_T4
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    String str1 = input.nextLine();
    String new_word = "";
    for(int i = 0; i < str1.length(); i++ )
    {
      char ch = str1.charAt(i);
      int ascii = (int) ch;
      if(ch==str1.charAt(i))
      {
        ascii = ascii-1;
        new_word = new_word + (char) ascii;
      }

    }
    System.out.print(new_word);
  }
}