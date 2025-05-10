import java.util.Scanner;
public class A7_HW1{
  public static void main (String[]args){
      Scanner input = new Scanner (System.in);
      
      String line_1 = input.nextLine();
      String new_word = "";
      String rev = "";
      for(int i = 0; i < line_1.length(); i++){
          char ch  = line_1.charAt(i);
          
          if(ch!=' '){
              new_word = new_word + ch;
          }
          else if(ch == ' '){
              rev = new_word+" "+rev;
              new_word = "";
          }
      }
      rev = new_word + " "+rev;
      System.out.print(rev);
  }
}