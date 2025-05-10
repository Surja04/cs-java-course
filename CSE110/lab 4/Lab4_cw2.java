import java.util.Scanner;
public class Lab4_cw2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
//        int i=1;
        int n1=input.nextInt();
       int sum=0;
        for(int i=1; i<=n1;i++){
         int num = input.nextInt();
             sum=sum+num;
//            System.out.print(sum);
            
        }
        System.out.println(sum);
        System.out.println((double)sum/n1);
        
        
    }
  
}
