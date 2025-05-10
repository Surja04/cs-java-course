import java.util.Scanner;
public class NextRound{
  public static void main (String[] args){
      Scanner input = new Scanner (System.in);
      
      int n = input.nextInt();
      int k = input.nextInt();
      int arr[] = new int[n];
      int count = 0;
      for(int i = 0; i<n;i++){
           arr[i] = input.nextInt();          
      }
      for(int i = 0; i<n; i++){
        if(arr[i]>0 && arr[i] >= arr[k-1]){
           count++;
        }
      }
      System.out.print(count);
  }
}