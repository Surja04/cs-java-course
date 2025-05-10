import java.util.Scanner;
public class Sum_of_arrays{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int arr [] = new int [input.nextInt()];
        int leng = arr.length;
        int sum=0;
        
        for(int i=0; i<=leng-1;i++){
            arr[i] = input.nextInt();
        }
        for(int i=0; i<=leng-1;i++){
            sum= sum+arr[i];
        }
        System.out.print(sum);
    }
}
