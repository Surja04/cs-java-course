import java.util.Scanner;
public class Lab4_ev2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);    
    int height=sc.nextInt();
   
    for (int i=1;i<=height;i++){
      for(int j=1;j<=height-i;j++){
      System.out.print(" ");
      }
      for (int j=1;j<=i;j++){
      System.out.print(j);
     
      }
      System.out.println();
    }
  }
}