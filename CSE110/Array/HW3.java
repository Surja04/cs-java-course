import java.util.Scanner;
public class HW3{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array1 length :");
        int N= input.nextInt();
        int arr_1 [] = new int [N];
        
        
        System.out.println("Please enter the elements of array 1:");
        
        for(int index=0; index<N; index++){
            arr_1[index]= input.nextInt();
        }
        
        System.out.println();
        
        System.out.print("Please enter the elements of array 2:");
        int M = input.nextInt();
        int arr_2 [] = new int [M]; 
        
        for(int index = 0; index<M; index++){
             arr_2[index]= input.nextInt();
        }
        int CurrentElement = 0;
//        boolean issubset=true;
        int count=0;
        for(int i=0; i<M; i++){
            CurrentElement=arr_2[i];
            
            for(int j=0; j<N; j++ ){
                if(arr_1[j]==CurrentElement){
                    count++;
                }
            }
            
        }
        if(count==M){
            System.out.print("Array 2 is a subset of Array 1");
        }
        else {
            System.out.print("Array 2 is not a subset of Array 1");
        }
    }
        
}