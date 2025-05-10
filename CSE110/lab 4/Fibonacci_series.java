import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+second);
        for(int i=3;i<=num;i++){
            int fibo=first+second;
           
            System.out.print(" "+fibo+" "); 
            first=second;
            second=fibo;
           
        }
    }
    
}
