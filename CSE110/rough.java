import java.util.Scanner;
public class rough{
  public static void main (String[] args){
      Scanner input = new Scanner (System.in);
      
      String word = "aBcSDefGH";
      String new_word = "";
      int length = word.length();
      
      for(int i = 0; i < length; i++){
          char ch = word.charAt(i);
          int ascii = (int)ch;
          
          if(ascii >= 97 && ascii <= 122){
             ascii = ascii-32;
             new_word = new_word + (char)ascii;
          }
          else{
             new_word = new_word+(char)ascii;
          }
      }
      System.out.print(new_word);
      
  }
}