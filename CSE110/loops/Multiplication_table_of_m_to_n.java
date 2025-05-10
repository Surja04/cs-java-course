import java.util.Scanner;
public class Multiplication_table_of_m_to_n {
    
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        for(int i=m; i<=n; i++ ){
            for(int j=1;j<=10;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println();
        }
    }
    
}
