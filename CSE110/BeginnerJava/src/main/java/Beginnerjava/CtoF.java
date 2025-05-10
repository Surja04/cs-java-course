
package Beginnerjava;
import java.util.Scanner;


public class CtoF {
    public static void main(String [] args){
        Scanner input=new Scanner (System.in);
        
        
        System.out.print("Enter The Celcius Value:");
        Double celcius=input.nextDouble();
        Double ferenheight=(celcius*9/5)+32;
        System.out.print("F:"+ferenheight);
        
        
       
       
    }
    
}
