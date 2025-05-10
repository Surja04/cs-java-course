import java.util.Scanner;
public class test5{
  public static void main (String[]args){
      Scanner input = new Scanner (System.in);
      
      System.out.print("Input Number of items:");
      int N = input.nextInt();
      int sum=0;
      for(int i=1; i<=N; i++){
        if(i%2!=0){
           System.out.println(i);
           sum=sum+i;
        }
      }
      System.out.println("The Sum of odd Natural Numbers:"+sum);
      
  }
}