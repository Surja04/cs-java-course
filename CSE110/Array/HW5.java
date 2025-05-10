import java.util.Scanner;
public class HW5 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        int N = input.nextInt();
        int arr_1 [] = new int [N];
        
        for(int i=0; i<N; i++){
            arr_1[i]=input.nextInt();
        }
        for(int i=0; i<N; i++){
            System.out.print(arr_1[i]+" ");
        }
        System.out.println();
        
        for(int i=0; i<N-1; i++){
            int max_index= i;
            for(int j=i+1; j<N; j++){
                if(arr_1[max_index]<arr_1[j]){
                    max_index=j;
                }
                
            }
            int temp = arr_1[max_index];
            arr_1[max_index] = arr_1 [i];
            arr_1[i] = temp; 
            
        }
        for(int i=0; i<N; i++){
            System.out.print(arr_1[i]+" ");
        }
        
    }
}