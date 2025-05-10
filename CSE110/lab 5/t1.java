import java.util.Scanner;
public class t1{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      int N = input.nextInt();
      int count=0;
      int num = 2;
      while(count!=N){
          boolean prime = true;
          
          for( int i =2; i < num; i++ ){
            if( num % i == 0 ){
              
              prime=false;
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