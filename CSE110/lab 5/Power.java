import java.util.Scanner;
public class Power {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
            int num3=input.nextInt();
            int c=1;
          
                for(int i=1;i<=num2;i++){
                    c=c*num1;
                }
                 int d=1;
                for(int j=1; j<=num3; j++){
                    d=c*num1;
                }
                System.out.print(d);
            
    }
    
}
