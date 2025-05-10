import java.util.Scanner;
public class Hw_2 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        for(int i=1; i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            int j;
            for( j=1; j<=i;j++){
                System.out.print(j);

            }
             for(int k=j-2; k>=1;k--){
             System.out.print(k);
             }

            System.out.println();
        }
    } 
}
