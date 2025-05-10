import java.util.Scanner;
public class Hw_6 {
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
                System.out.print(j);
            }
            System.out.println();            
            
        }
        for(int k=n-1;k>=1;k--){
            for(int space=1; space<=n-k;space++){
                System.out.print(" ");
            }
            for(int r=1; r<=2*k-1; r++){
                System.out.print(r);
            }
            System.out.println();
            
        }

    }   
}
