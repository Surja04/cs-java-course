import java.util.Scanner;
public class Lab4_hw1 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System.out.print("Input number of terms:");
        int num=input.nextInt();
        int sum=0;
        int j=1;
        for(int i=1; i<=num; i++){
            System.out.println(j);
            sum=sum+j;
            j+=2;
            
        }
        System.out.print(sum);
    }   
}
