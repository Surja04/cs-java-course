import java.util.Scanner;
public class primenumbers{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    
    int num_1 = input.nextInt();
    int num_2 = input.nextInt();
    
    for(int i=num_1; i<=num_2; i++){
       
      boolean prime = true;
      
      for(int j = 2; j<num_1; j++){          
           if(num_1 % j == 0){
               prime = false;
               break;
           }          
      }
      if(prime){
          System.out.println(num_1);
      }
      num_1++;
      
        
    }
  }
}