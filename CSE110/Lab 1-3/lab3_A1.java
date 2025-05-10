import java.util.Scanner;
public class lab3_A1{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        int num1=input.nextInt();
        int num2=input.nextInt();
         String operator = input.next();
       
        
        if(operator.equals("+")){
            System.out.print(num1+num2);
        }
        else if(operator.equals("-")){
            System.out.print(num1-num2);
        }
        else if(operator.equals("*")){
            System.out.print(num1*num2);
        }
        else if(operator.equals("/")){
            System.out.print(num1/num2);
        
        }
    
    }

}