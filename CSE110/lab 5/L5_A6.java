import java.util.Scanner;
public class L5_A6{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      
      int start = input.nextInt();
      int stop = input.nextInt();
      for(int i = start; i <= stop; i++){
        for(int j = 1; j <= 10; j++){
            System.out.println(i+"*"+j+"="+i*j);
        }
      }
  }
}