
package Beginnerjava;
import java.util.Scanner;


public class TriangleArea {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base:");
        double base=input.nextDouble();
        System.out.print("Enter Height:");
        double height=input.nextDouble();
     
        double area=0.5*base*height;
        
        System.out.print("Area:"+area);
    }
    
}
