import java.util.Scanner;
public class FunctionPractice
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
      String sentence = input.nextLine();
      int position = input.nextInt();
      System.out.print(wordsConcat(sentence,position));
  }
  public static String wordsConcat(String sen, int pos)
  {
    String word1 = "";
    String word2 = "";
    String word3 = "";
    for(int i = 0; i < sen.length(); i++)
    {
        char ch = sen.charAt(i);
        if(i==0)
        {
          word1=word1+ch;
        }
        else if(i%pos==0){
           word2 = word2+ch;
        }
        else {
            word1 = word1+ch;
        }
    }
    word3 = word1+word2;
    return word3;
  }
  
}