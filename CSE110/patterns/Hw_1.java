import java.util.Scanner;
public class Hw_1 {
    public static void main(String[]args){
    Scanner input=new Scanner (System.in);
    int col=input.nextInt();
    int row=input.nextInt();
    for(int i=1; i<=row;i++){

        for(int j=col; j>=1;j--){
        System.out.print(" "+j);
        }
    System.out.println();
    }
  } 
}
