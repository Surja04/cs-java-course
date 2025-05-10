import java.util.Scanner;
public class A8_CW3{
  public static void main(String[]args){
     Scanner input = new Scanner (System.in);
     
     //a     
    
     System.out.print("Enter the length of an array: ");
     int N = input.nextInt();
     int arr1 [] = new int [N];
     for(int i = 0; i < N; i++){
       System.out.print("Enter a number:");
       arr1[i] = input.nextInt();
     }
     int arr2[] = new int [N];
     int z = N-1;
     for(int j = 0; j < N; j++){
         arr2[j] = arr1 [z];
         z--;
     }
     System.out.println("Reversed using a new array:");
     for(int j = 0; j < N; j++){
        System.out.print(arr2[j]+" ");
     }
     
    //b
     int k = N-1;
     int temp;
     for(int i = 0; i < N/2; i++){
       temp = arr1[i];             //temp=arr1[i];
       arr1[i]= arr1[k];             //arr1[i] = arr1[N-i-1];
       arr1[k]= temp;             //arr1[N-i-1] = temp;
       k--;
     }
     for(int i = 0; i < N; i++){
       System.out.print(arr1[i]+" ");
     }
         
  }
}

