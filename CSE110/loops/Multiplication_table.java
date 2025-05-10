import java.util.Scanner;
public class Multiplication_table {
    
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(num+" X "+i+"="+num*i);
        }
    }
    
}
