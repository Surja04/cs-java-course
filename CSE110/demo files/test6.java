import java.util.Scanner;
public class test6{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      int N = input.nextInt();
      int sum=0;
      for(int i = 0; i < N; i++){
          System.out.print("Enter Number:");
          int num = input.nextInt();
          sum = sum + num;
          System.out.println("Sum:"+sum);
      }
      
  }
}