import java.util.Scanner;
public class HW1_b{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        double arr[] = new double [N];
         double min=0;
         int index=-1;
        
        for(int i = 0; i < N; i++){
            System.out.print("Enter a number:");
            arr[i] = input.nextDouble();
            
        }
       
        for(int i = 0; i < N-1; i++ ){
            for(int j = i+1; j<N; j++){
                if(arr[i] > arr[j]){
                   min=arr[j];
                   index = j;
                }
                else{
                   min=arr[i];
                   index=i;
                }
            }
        }
        System.out.print("Minimum element "+min+ " found at " + "index "+index);
    }
}