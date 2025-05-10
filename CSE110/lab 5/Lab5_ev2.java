import java.util.Scanner;
public class Lab5_ev2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        int count=0;
        while(true){
            int num=input.nextInt();
            
              if(num%2==0){
                  count=0;
                  for(int i=1; i<=num; i++){
                    if(num%i==0){
                        count++;
                    }
                                      
                }
                   System.out.println(num+" has "+count+" divisors"); 
              
            }
              else{
                  break;
              }
        }

    } 
}
