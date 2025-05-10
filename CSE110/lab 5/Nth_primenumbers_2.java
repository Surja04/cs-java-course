import java.util.Scanner;
public class Nth_primenumbers_2{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      
      int num = 2;
      int count = 0;
      int N = input.nextInt();
      while(count!=N){
        boolean prime = true;
        for(int i = 2; i < num; i++ ){
          if(num%i==0){
              prime = false;
              break;
          }

        }
                  if(prime){
              System.out.println(num);
              count++;
          }
          num++;
      }
  }
}