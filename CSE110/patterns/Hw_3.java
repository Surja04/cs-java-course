import java.util.Scanner;
public class Hw_3 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int col=input.nextInt();
        int row=input.nextInt();
        for(int i=1; i<=row;i++){            
            for(int j=1; j<=col;j++){
                if(i==1 || i==row ){
                    System.out.print(j);
                }
                else if( j==1 || j==col){
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
