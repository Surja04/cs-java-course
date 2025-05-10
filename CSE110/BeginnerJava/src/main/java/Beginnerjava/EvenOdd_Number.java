
package Beginnerjava;
import java.util.Scanner;


public class EvenOdd_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter An Integer:");
        int num=input.nextInt();
        
        
           if(num%2==0){
               System.out.print("The Number is Even");
           }
           else{
               System.out.print("The Number is Odd");
           }
        
       
    }
    
}
