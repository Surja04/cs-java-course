import java.util.Scanner;
public class A7_HW3 {
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      String w1 = input.nextLine();
      String w2 = input.nextLine();
      boolean isequal = false;
      String word = "";
      for(int i = 0; i < w1.length(); i++ ){
        isequal = false;
        char ch1 = w1.charAt(i);
        for(int j = 0; j < w2.length(); j++){
            char ch2 = w2.charAt(j);
            
            if(ch1 == ch2){
                isequal = true;
                break;
            }
        }
        if(!isequal){
           word = word + ch1;
        }
      }
     
      for(int i = 0; i < w2.length(); i++ ){
        isequal = false;
        char ch1 = w2.charAt(i);
        for(int j = 0; j < w1.length(); j++){
          char ch2 = w1.charAt(j);
          
          if(ch1 == ch2){
            isequal = true;
            break;
          }
        }
        if(!isequal){
          word = word + ch1;
        }
      }
      String word_capital="";
      for(int k = 0; k < word.length(); k++){
          char ch3 = word.charAt(k);
          int ascii = (int) ch3;
          if(ascii>=97 && ascii <= 122){
              ascii = ascii - 32 ;
              word_capital = word_capital + (char)ascii;
          }
          else{
              word_capital = word_capital + (char)ascii;
          
          }
      }
      System.out.print(word_capital);
            
  }
}