import java.util.Scanner;
import java.lang.Math;
public class Lab3_A3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        if(x<0){
            System.out.print(2*x);
        }
//            if(x<0){
//            System.out.print(2x);
//        }
            else if(x>=0&&x<2){
            System.out.print(x+1);
        }
            else if(x>=2&&x<5){
            System.out.print((int)Math.pow(x,2)-1);
        }
           else if(x>=5){
            System.out.print(3*(int)Math.pow(x,2)+2);
        } 
    }
    
    
}
