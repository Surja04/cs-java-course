import java.util.Scanner;
public class test8{
  public static void main(String[]args){  
  Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    int count = 0;
    
    for(int i=0; n!=0; i++){
        n=n/10;
        count++;
    }
    System.out.print(count);
  }
}