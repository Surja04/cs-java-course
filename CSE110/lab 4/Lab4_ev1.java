import java.util.Scanner;
public class Lab4_ev1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
         int num=input.nextInt();
          System.out.println("The Divisor of "+num+" is:");
        for(int i=1; i<=num; i++){
           
            if(num%i==0){
               
             System.out.println(i);
            }
        }
    }
   
}
