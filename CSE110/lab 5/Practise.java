import java.util.Scanner;
public class Practise {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        
        for(int i=num1; i<=num2; i++){
            int count=0;
            int temp= i;
            if(temp%2==0){
                for(int j=1;j<=temp;j++){
                    if(temp%j==0){
                        count++;
                    }                   
                }
            if(count>4){
               System.out.println(i);
                }
            }
            
        }
        
        
        
    }
    
}
