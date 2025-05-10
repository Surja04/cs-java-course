import java.util.Scanner;
public class Arithmetic {
  public static void main(String [] args){
    Scanner input=new Scanner(System.in);
      System.out.print("Enter any Number:");
      int num1=input.nextInt();
    System.out.print("Enter another Number:");
       int num2=input.nextInt();
    
     int sum=num1+num2;
     int sub=num1-num2;
     System.out.println("Addition:"+sum);
     System.out.print("Subtraction:"+sub);
     
    
  }
  
 
  
}
