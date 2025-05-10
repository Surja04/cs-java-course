import java.util.Scanner;
public class Quiz3_b {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int start=input.nextInt();
        int end=input.nextInt();
        int count=0;
        for(int i=start; i<=end; i++){
            int temp=i;
            temp=temp%10;
            if(temp%3==0 && temp%2==0){
                continue;
            }
            else if(temp%3==0 || temp%2==0){ 
                System.out.println(i);
                count++;
            }
        }
        System.out.print("The magic numbers are:"+count);
    }
}
