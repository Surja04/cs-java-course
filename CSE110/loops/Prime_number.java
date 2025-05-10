import java.util.Scanner;
public class Prime_number {
    
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
         
        System.out.print("Enter first number:");
        int m=input.nextInt();
        
        System.out.print("Enter last number:");
        int n=input.nextInt();
       
        
        for(int i=m;i<=n;i++){
            int count=0;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    count++;
                    break;
                }
                
            }
            if(count==0){
                System.out.println(i);
                count=0;
            }
        
            
        }
    }
    
    
    
    
}
