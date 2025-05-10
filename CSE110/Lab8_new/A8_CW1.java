import java.util.Scanner;
public class A8_CW1{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      //a
      System.out.print("N = ");
      int N = input.nextInt();      
      int arr_1 [] = new int [N];
      
      for(int i = 0; i < N; i++){
          System.out.print("Enter a Number:");
          arr_1[i] = input.nextInt();
      }
      for(int i = 0; i < N; i++){
        System.out.println(i+ ": "+ arr_1[i]);
       
      }
      //b
      int arr_2 [] = new int [N+1];
      for(int i = 0; i < N; i++){
          arr_2[i] = arr_1[i];
      }

      System.out.print("Enter Another Number:");
      arr_2[N]=input.nextInt();
      System.out.print("After resizing the Array: ");
      for(int i = 0; i < N+1; i++){
        System.out.print(arr_2[i]+" ");
      }
  }
}