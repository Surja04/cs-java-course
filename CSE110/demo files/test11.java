import java.util.Scanner;
public class test11{
    public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      int num = input.nextInt();
      int sum=0;
      for(int i=1; i<num; i++){
        if(num%i==0){
           sum = sum+i;
            
        }
        
      }
      if(sum==num){
        System.out.print("perfect number");
      }
      else{
        System.out.print("not perfect");
      }
  }
}