import java.util.Scanner;
public class Factorial_of_m {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int m = input.nextInt();
       int  n=1;
       int multi=1;
        for(int j=n;j<=m;j++){
            multi=multi*j;
        }
        System.out.println("Factorial of Userinput:"+multi);
        System.out.print(n);//jokhn loop er vitore j=n dibo,tokhn sheta loop er vitorei kaj korbe.for loop er scope off korar por n=1 e initiate korbe jodi value ta print kori;
        
    
    }
    
}
