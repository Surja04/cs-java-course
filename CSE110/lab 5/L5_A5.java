import java.util.Scanner;
public class L5_A5{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      
      int N = input.nextInt();
      int num = 2;
      int count = 0;
      
      while(count!=N){
         int sum = 0;
        for(int i=1; i<num; i++){
           
           
          if(num%i==0){
            sum = sum+i;   
          }
//          System.out.println(sum);
        }
        if(sum==num){
           System.out.println(num);
           count++;
        }
        num++;
      }  
  }
}