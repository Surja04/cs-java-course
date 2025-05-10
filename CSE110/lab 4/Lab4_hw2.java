import java.util.Scanner;
public class Lab4_hw2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int i=1;
        int sum=0;
        while(i<=10){
            System.out.print("Enter Number:");
            int num=input.nextInt();
            sum+=num;
            System.out.println("Sum="+sum);
            i++;
        }
    }  
}
