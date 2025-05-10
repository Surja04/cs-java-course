import java.util.Scanner;
public class Perfect_number {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int perfect_quantity=input.nextInt();
        int count=0;
        int num1=2;
        
        while(count<perfect_quantity){ 
            int sum=0; 
            for(int i=1;i<num1;i++){
                if(num1%i==0){
                    sum=sum+i;     
                }
            }
            if(sum==num1){
                System.out.println(num1);
                count++;
            }
            num1++;
            System.out.println(num1);
        }
    }   
}
