import java.util.Scanner;
public class Nth_primenumbers {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int num=2;
        int count=1;
        boolean prime=true;
        while(count<=N){
            prime=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    prime=false;
                    break;                    
                }                
            }
            if(prime==true){
                System.out.println(num);
              
                 count++;
            }
//            System.out.println("Count: " + count);                
//            System.out.println("Num: " + num);
            
            num++; 
           
            
        }
        
    }
    
}
