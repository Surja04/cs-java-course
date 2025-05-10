//Task 8
import java.util.Scanner;
public class A1_T8
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    System.out.print("row = ");
    int row = input.nextInt();
    System.out.print("col = ");
    int col = input.nextInt();
    int arr1 [][] = new int [row][col];   
    for(int i = 0; i < row;i++)
    {
      for(int j = 0; j < col; j++)
      {
        arr1[i][j] = input.nextInt();
      }
    }
    
    System.out.println("2D Array: ");
    for(int i = 0; i < row; i++)
    {
      for(int j = 0; j< col; j++)
      {
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
    int arr2 [] = new int [row*col];
    int k = 0;
      for(int i = 0; i < row; i++)
      {
        for(int j = 0; j < col; j++)
        {
          arr2[k] = arr1[i][j];
          k++;
        }
      }
      System.out.println();
    System.out.println("1D Array:");
    for(int i = 0; i < row*col; i++)
    {
      System.out.print(arr2[i]+" ");
    }
  }
}