import java.util.Scanner;
public class Selection_Sorting_2{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Array Number:");
        int arr [] = new int [input.nextInt()];
        int leng = arr.length;
        
        for(int c = 0; c <= leng-1; c++){
            arr[c] = input.nextInt();
        }
        for(int d = 0; d<= leng-1; d++){
           System.out.print(arr[d]+ " ");
        }
        System.out.println();
        for(int i = 0; i < leng-1; i++ ){
            int min_index = i;
            for(int j = i+1; j<leng; j++ ){
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        for(int f = 0; f <= leng-1; f++){
            System.out.print(arr[f]+ " ");
        }

    }
}
