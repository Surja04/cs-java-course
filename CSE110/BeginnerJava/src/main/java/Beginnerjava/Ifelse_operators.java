
package Beginnerjava;
import java.util.Scanner;


public class Ifelse_operators {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
       System.out.print("Enter a Number:");
    int num=input.nextInt();
    
    if(num>0){
        System.out.print("Positive");
        
    }
    else if(num<0){
        System.out.print("Negative");
        
    }
    else{
        System.out.print("Zero");
    }
       
    }
          
    
}
