import java.util.Scanner;
public class Array_Iteration{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int arr [] = new int [input.nextInt()];
        int leng = arr.length;
        
        for(int i=0; i<=leng-1; i++){
            arr[i] = input.nextInt();           

        }
        for(int j = 0; j<=leng-1; j++){
            System.out.println(arr[j]);
        }
    }
}