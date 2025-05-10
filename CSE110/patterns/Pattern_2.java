import java.util.Scanner;
public class Pattern_2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=n;
     
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= i; col++){
                System.out.print(" "+col);

            }
            i=i-1;
            System.out.println();
            
            
        }
        
    }
}
