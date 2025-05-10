import java.util.Scanner;
public class Numbers {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
//        count=1;
//        int j=1;
        for(int i=1; i<=N; i++){
            if(i%5==0){
                
               System.out.println(i);
            }
            else{
                System.out.print(i+" ");
            }

        }
    }
}
