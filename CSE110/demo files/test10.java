import java.util.Scanner;
public class test10{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      
      int num = input.nextInt();
      for(int i=2; i<num; i++){
        if(num%i==0){ 
          System.out.print("not prime");
             break;
           
        }
        else{
            System.out.print("prime");
            break;
        }
      }
  }
}