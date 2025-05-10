import java.util.Scanner;
public class Long_words{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    
    int n = input.nextInt();
    input.nextLine();
    
    String z = "";    
    int count = 0;    
    for(int i = 0; i < n; i++){      
      z = input.next();
      count=0;
      if(z.length()>10){
      for(int j=0; j<z.length(); j++){
        if(j>0 && j<z.length()-1){
           count++;            
        }        
      }
      System.out.print(z.charAt(0));
      System.out.print(count);
      System.out.print(z.charAt(z.length()-1));
      System.out.println();
    }
      else{
          System.out.println(z);
      }      
    }   
  }
}