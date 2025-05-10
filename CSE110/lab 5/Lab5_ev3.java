import java.util.Scanner;
public class Lab5_ev3 {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int sum=0;
    int y=0;
    for(int i=1; i<=N; i++){
        sum=sum+i;
        y=y-sum;
    }
    System.out.print("the value of y is:"+y);
    }
    
}
