import java.util.Scanner;
public class Lab3_A5{
    public static void main(String[]args){
       Scanner input=new Scanner(System.in);
       int income=input.nextInt();
       int age=input.nextInt();

              if ( age>=18){
                  if(income>=10000 && income<=20000){
                      int tax1=income*5/100;
                      System.out.print("Your tax amounts in " +tax1 + " Tk");
                  }
                  else if(income>20000){
                      int tax2=income*10/100;
                      System.out.print("Your tax amounts in " +tax2 + " Tk");
                  }
    
                  
       }
                                else if(income<10000 || age<18){
                      System.out.print("Your tax amounts in 0 Tk");
                  }
        
    }
}