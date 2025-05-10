import java.util.Scanner;
public class A9_CW1_A
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();    
    evenChecker(n);
  }
  public static void evenChecker(int a)
  {
//    A.............
    if(a%2==0){
        System.out.print("Even!!");
    }
    else{
        System.out.print("Odd!!");
    }
  }
  
}