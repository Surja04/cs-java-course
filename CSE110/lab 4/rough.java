import java.util.Scanner;
public class rough{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      
      int n1 = 10000;
      int n2 = 35000;
      int n3 = n2/n1;
      int n4 = n2%n1;
      System.out.println(n3);
      System.out.println(n4);
  }
}