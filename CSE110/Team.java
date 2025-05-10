import java.util.Scanner;
public class Team{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    int count = 0;
    
    for(int i = 1; i <= n; i++){
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = num1+num2+num3;
        if(sum >= 2){
         count++;
        }        
    }
            System.out.print(count);
  }
}