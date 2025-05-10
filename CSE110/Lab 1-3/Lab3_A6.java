import java.util.Scanner;
public class Lab3_A6 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        if(num1>=num2 && num1>=num3  ){
            if( num2>=num3){
            System.out.println("Maximum number is "+num1);
            System.out.println("Minimum number is "+num3);
            }
            else {
             System.out.println("Maximum number is "+num1);
             System.out.println("Minimum number is "+num2);
             
            }    
           
        }
            if(num2>=num1 && num2>=num3  ){
                if( num1>=num3){
                System.out.println("Maximum number is "+num2);
                System.out.println("Minimum number is "+num3);
            }
            else {
                  System.out.println("Maximum number is "+num2);
                  System.out.println("Minimum number is "+num1);
             
            }    
           
        }
            if(num3>=num1 && num3>=num2 ){
                if( num2>=num1){
                System.out.println("Maximum number is"+num3);
                System.out.println("Minimum number is"+num1);
            }
            else {
                  System.out.println("Maximum number is"+num3);
                  System.out.println("Minimum number is"+num2);
             
            }    
           
        }
      
    }
  
}
