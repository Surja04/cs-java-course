import java.util.Scanner;
public class t2{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      
      int n1 = input.nextInt();
      int j = n1;
      int count = 0;
      while( j != 0){
          j= j%10 ;
          if(n1>10){
          System.out.print(j+",");
          }
          else{
           System.out.print(j);
          }
          j = n1/10;
          n1=j;
          count++;
      }
      
  }
}