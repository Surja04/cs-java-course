import java.util.Scanner;
public class bit{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    
    int n = input.nextInt();
    int X = 0;
    String str;    
    
    for(int i =1; i<=n; i++){      
      str = input.next();
      
      if(str.equals("++X")){
        ++X;
      }
      else if(str.equals("--X")){
         --X;
      }
      
      else if(str.equals("X++")){
         X++;
      }
      
      else if(str.equals("X--")){
         X--;
      }
      
    }
    System.out.print(X);
    
  }
}