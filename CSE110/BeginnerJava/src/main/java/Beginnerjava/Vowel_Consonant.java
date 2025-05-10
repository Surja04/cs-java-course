
package Beginnerjava;
import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter any Character Value:");
        char ch=input.next().charAt(0);
        
        
          if(ch=='a'){
              System.out.print("Vowel");
              
          }
          
          else if(ch=='e'){
              System.out.print("Vowel");
              
          }
         else if(ch=='i'){
              System.out.print("Vowel");
              
          }
          else if(ch=='o'){
              System.out.print("Vowel");
              
          }
          else if(ch=='u'){
              System.out.print("Vowel");
              
          }
          else{
              System.out.print("Consonant");
          }
          
          
    }
    
}
