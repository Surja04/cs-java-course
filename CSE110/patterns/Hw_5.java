import java.util.Scanner;
public class Hw_5 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i;space++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=(2*i-1); j++){
                if(i==1||i==n||j==1||j==2*i-1){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }                
            }
            System.out.println();
        }
    }  
    
}
