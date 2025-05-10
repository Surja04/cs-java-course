import java.util.Scanner;
public class Cw3 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int n=input.nextInt();
        int k=n;
        for(int i=1; i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }

            for(int j=k; j<=n; j++){
                System.out.print(j);
                
            }
            System.out.println();
            k=k-1;

        }
    }
    
}
