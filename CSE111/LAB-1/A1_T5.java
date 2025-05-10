//Task5
import java.util.Scanner;
public class A1_T5
{
  public static void main(String [] args)
  {
  Scanner input = new Scanner (System.in);
  System.out.print("Enter the Length of an array:");
  int n = input.nextInt();
  int arr1 [] = new int [n];
  for(int i =0; i<arr1.length; i++)
  {
    arr1[i] = input.nextInt();
  }
     int k = n-1;
     int temp;
     for(int i = 0; i < n/2; i++){
       temp = arr1[i];             //temp=arr1[i];
       arr1[i]= arr1[k];             //arr1[i] = arr1[N-i-1];
       arr1[k]= temp;             //arr1[N-i-1] = temp;
       k--;
     }
     for(int i = 0; i < n; i++){
       System.out.print(arr1[i]+" ");
     }
  }
}