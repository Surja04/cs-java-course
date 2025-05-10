import java.util.Scanner;
public class Lab4_hw6 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean isPrime=true; 

        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }            
        }
        
        if(isPrime==true) System.out.println(num + " is a prime number");
        else System.out.println(num+" is not a prime number");
        
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum + i;
            }            
        }
        
        if(num == sum){System.out.println(num + " is a perfect number");
        }
        else {System.out.println(num+" is not a perfect number");
        }
    } 
}
