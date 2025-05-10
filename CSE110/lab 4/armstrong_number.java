import java.util.Scanner;
public class armstrong_number{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    int num_1 = input.nextInt();
    int num_2 = input.nextInt();
//    int j=num_1;
//    int k=num_1;
    int count = 0;
    double sum = 0;
    int sum_1=0;
    
    for(int i = num_1; i <= num_2; i++){
      int j=i;//restoring j's value;
      count = 0 ;
      sum = 0;
      sum_1 = 0;
      
      while(j!=0){
        j=j/10;
        count++;
      }
      j=i;      
      
      double pow = Math.pow(10,(count-1));
      int divisor = (int) pow;
      
      while(j!=0){
        j = j/divisor;
//           System.out.print(j);
        sum =Math.pow(j,count);
        sum_1 = sum_1 +(int) sum;
        j = i%divisor;
        divisor = divisor/10;
        
      }
      if(sum_1==i){
        System.out.println(i);
      }
//      
    }
    
    
  }
}