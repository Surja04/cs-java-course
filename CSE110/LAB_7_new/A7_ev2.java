import java.util.Scanner;
public class A7_ev2{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      String word = input.nextLine();
      String new_word = "";
      int length = word.length();
      
      for(int i = 0; i < length; i++){
         char ch = word.charAt(i);
         int ascii = (int)ch;
         if(ascii >= 65 && ascii <= 90){
             ascii = ascii+32;
             new_word = new_word+(char)ascii;
         }
         else{
             new_word = new_word+(char)ascii;
         }
      }
      int vowel = 0;
      int consonant = 0;
      
      for(int j = 0; j < new_word.length(); j++){
          char ch_1 = new_word.charAt(j);
          if(ch_1 == 'a' || ch_1 == 'e' || ch_1 == 'i' || ch_1 == 'o' || ch_1 == 'u'){
              vowel++;
          }
          else if(ch_1 >= 'a' && ch_1 <= 'z'){
              consonant++;
          }
      }
      if(vowel%3==0 && vowel>0 && consonant%5==0 && consonant > 0){
          System.out.print("Aaarr! Me Plunder!!!!");
      }
      else {
          System.out.print("Blimey!NO Plunder!!!!");
      }
  }
}