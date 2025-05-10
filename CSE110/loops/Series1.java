import java.util.Scanner;
public class Series1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        for(int j=1; j<=n; j++){
            System.out.print(j+" ");
            sum=sum+j;
        }
        System.out.println();
        System.out.print(sum);
   }
   
}
