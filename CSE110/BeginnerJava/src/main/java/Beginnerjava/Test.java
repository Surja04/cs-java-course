
package Beginnerjava;

import java.util.Scanner;



    


public class Test{
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int num1,num2,result,re,res;
       
       System.out.print("Enter First Number:");
       num1=input.nextInt();
       
       System.out.print("Enter Second Number:");
       num2=input.nextInt();
       
       result=num1+num2;
       re=num1-num2;
       res=num1*num2;
      
       
       
        System.out.println("Sum"+result);
       System.out.println("Sub:"+re);
       
       
       System.out.println("Multi:"+res);
       

       

       
       
        
    }
    
}


