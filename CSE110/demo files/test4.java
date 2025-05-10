import java.util.Scanner;
public class test4{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    int count_1=0;
    int count_2=0;
    
    System.out.print("Enter Number Cap:");
    int N = input.nextInt();    
    
    for(int i=0; i<N; i++){      
      
      System.out.print("Enter Number"+(i+1));
      int num = input.nextInt();
      
      if(num>0){
        count_1++;
      }
      else{
        count_2++;
      }
    }
    
    System.out.println(count_1 + "Non-negative Numbers");
    System.out.print(count_2 + "Negative Numbers");
  }
}