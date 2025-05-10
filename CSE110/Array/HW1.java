import java.util.Scanner;
public class HW1{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        double arr[] = new double [N];
        
        int index_1=-1;
        int index_2=-1;
        int i=0;
        
        double max=arr[i];
        double min=arr[i];
        double sum=0;
        double avg=0;
        
        for( i = 0; i < N; i++){
            System.out.print("Enter a number:");
            arr[i] = input.nextDouble();
            
        }
        
        for(int j=0; j<N; j++){
            sum = sum+arr[j];
        }
        avg = sum/N;
        
        for( i = 0; i < N; i++ ){
            
            if(arr[i] > max){
                max=arr[i];
                index_1 = i;
            }
            else if(arr[i] < min){
                min=arr[i];
                index_2=i;
            }
            
        }
        System.out.println("Maximum element "+max+ " found at " + "index "+index_1);
        System.out.println("Minimum element "+min+ " found at " + "index "+index_2);
        System.out.println("Summation:"+sum);
        System.out.println("Average:"+avg);
        
    }
}