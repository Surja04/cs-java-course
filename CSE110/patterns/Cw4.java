import java.util.Scanner;
public class Cw4 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
