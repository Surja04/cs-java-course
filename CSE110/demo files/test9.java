import java.util.Scanner;
public class test9{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      int count = 0;
      
      int N = input.nextInt();
      int num=N;
      for(int i=0; num!=0; i++){
          num=num/10;
          count++;          
      }
      int num_2=N;
      int num_3=N;
      int dividend = 1;
      for(int z = 1; z <= count-1; z++){
          dividend = dividend * 10;
      }
     
     
      for(int j=0; num_2 != 0; j++){      
          num_2 = num_2/dividend;
          System.out.print(num_2);
          if(dividend>=10){
            System.out.print(", ");
          }
          num_2= num_3 % dividend;
          dividend = dividend/10;          
      }    
  }
}