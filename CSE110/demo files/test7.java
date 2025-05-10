import java.util.Scanner;
public class test7{
  public static void main (String[]args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      
      for(int i =0; i <= n; i++){
        if( i%5 == 0 && i%3 != 0 ){
            System.out.println(i);
        }
      }
  }
}