import java.util.Scanner;
public class Cw1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int length=input.nextInt();
        int width=input.nextInt();
        for(int i=1; i<=width; i++){
            for(int j=1; j<=length; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        
    }
}
