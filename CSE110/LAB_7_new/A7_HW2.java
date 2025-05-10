import java.util.Scanner;
public class A7_HW2{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      String word = "aabcccccaaa";
      int count = 1;
      int length = word.length();
      for(int i = 0; i < length-1 ; i++){
          char ch = word.charAt(i);

          
          if(word.charAt(i)==word.charAt(i+1)){
            
              count++;
              if(i==length-2){
                  System.out.print(ch);
                  System.out.print(count);
              }
              
          }
          else{
              System.out.print(ch);
              System.out.print(count);
              count = 1;
          }

          
      }
  }
}