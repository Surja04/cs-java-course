import java.util.Scanner;
public class Sum_of_m_to_n {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sum=0;
        int m=input.nextInt();
        int n=input.nextInt();
        for(int j=m ;j<=n; j++){
             sum=sum+j;
        } 
        System.out.print("Total sum of 1 to 10 is:"+sum);
       
    }
   
}
