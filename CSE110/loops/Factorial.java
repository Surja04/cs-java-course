import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int n=input.nextInt();
        int fact=1;
        for( int i=n; i>=1; i--){

            System.out.print(i);
            if(i!=1){
                System.out.print(" X ");
            }
            fact=fact*i;

        }
        
        System.out.println();
        System.out.println("The factorial of your input is: "+fact);
    }
    
}
