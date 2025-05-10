import java.util.Scanner;
public class Lab4_hw4_demo {
    public static void main(String[]args){
    Scanner input=new Scanner (System.in);
    int num=input.nextInt();
    int count=0;
    while(true){
        if(num/10!=0){
       count++;
        }
        System.out.print(count);
    }
    
    }

    
}
