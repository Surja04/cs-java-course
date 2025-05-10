import java.util.Scanner;
public class A7_HW5{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    
    String str_1 = input.nextLine();//String is given in the queston.
    String str_2 = input.nextLine();
    String new_word ="";
    boolean isequal = false;
    
    for(int i = 0; i < str_1.length(); i++){
      isequal = false;
      char ch1 = str_1.charAt(i);
      int ascii = (int)ch1;
      if(ascii>=65 && ascii <= 90){
          ascii = ascii+32;
          ch1 = (char)ascii;
      }
      
      for(int j = 0; j < str_2.length(); j++){
         char ch2 = str_2.charAt(j);
        if(ch1 == ch2){
          isequal = true;
          break;
        }
        
      }
      if(!isequal){
          new_word = new_word +ch1;
      }
    }
 
    System.out.print(new_word);
  }
}