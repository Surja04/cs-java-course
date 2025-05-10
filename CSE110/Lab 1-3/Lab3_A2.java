import java.util.Scanner;
public class Lab3_A2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
           if(num%5==0 && num%7==0){
            System.out.print("Divisible by Both");
        
        
        }
        else if(num%5==0){
            System.out.print("Invalid: Divisible by 5 Only");
        
        
        }
         else if(num%7==0){
            System.out.print("Invalid: Divisible by 7 Only");
        
        
        }

         else{
             System.out.print("NO");
         }
            
    }
   
}
