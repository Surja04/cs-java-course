import java.util.Scanner;
public class L5_A7{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      
      int start = input.nextInt();
      int end = input.nextInt();
      int third_input = input.nextInt();
      int num = start;
      
      for(int i = num; i <= end; i++){
          
         int x = num/10;
         int y = num%10;
         int z = x*y;
         if(z % third_input == 0){
             System.out.print(z+ " ");
         }
         num++;
      }
  }
}