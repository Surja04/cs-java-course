import java.util.Scanner;
public class If_else_task7_1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
     int   num1=input.nextInt();
        
        if(num1%2==0 || num1%5==0){
            System.out.print("The number is a multiple of either 2 or 5:"+num1);
        }
         else{
            System.out.print("The number is not a multiple of either 2 or 5");
        }
        
        
        
        
    }
    
    
    
    
    
}



