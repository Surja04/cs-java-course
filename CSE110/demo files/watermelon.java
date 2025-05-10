import java.util.Scanner;
public class watermelon{
  public static void main(String[]args){    
    Scanner input = new Scanner (System.in);
    int w = input.nextInt();
    
    if(1<= w && w <=100){
      
      if(w%2==0 && w!=2){
        System.out.print("YES");
        
      }
      else{
        
        System.out.print("NO");
      }      
    } 
  }
}