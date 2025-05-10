import java.util.Scanner;
public class Weight_measurement {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int N=input.nextInt();
        double sum=0;
        double min=99999999;
        for(int i=1; i<=N; i++){
            double num=input.nextDouble();           
            sum=sum+num;
            if(num<min){
                min=num;
            }
  
        }
        System.out.println(min);
        System.out.println(sum/N);
        System.out.println((sum/N)-min);
    }
    
}
