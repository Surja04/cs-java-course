import java.util.Scanner;
public class Hw_7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i;
        for( i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            int j;
            for( j=1; j<=2*i-1; j++){               
                if(j==1||j==2*i-1){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();          
        }
        for(int k=n-1;k>=1;k--){
            for(int space=1; space<=n-k;space++){
                System.out.print(" ");
            }
            for(int r=1; r<=2*k-1; r++){
                if(r==1||r==2*k-1){
                    System.out.print(r);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }  
    }   
}
