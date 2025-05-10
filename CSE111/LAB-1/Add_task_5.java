import java.util.Scanner;
public class Add_task_5
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    int M = input.nextInt();
    int N = input.nextInt();
    int A[][] = new int [M][N];
    int AT[][] = new int [M][N];
    
    for(int i = 0; i < M; i++)
    {
      for(int j = 0; j < N; j++)
      {
        A[i][j] = input.nextInt() ;
      }     
    }
    for(int i = 0; i < M; i++)
    {
      for(int j = 0; j < N; j++)
      {
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }
    int k = 0;
    int s = 0;
    for(int i = 0; i < M; i++)
    {
      k=0;
      for(int j = 0; j < N; j++)
      {
        AT[k][s] = A[i][j]; 
        k++;
      }
      s++;
    }
    System.out.println();
    for(int i = 0; i < M; i++)
    {
      for(int j = 0; j < N; j++)
      {
        System.out.print(AT[i][j]+" ");
      }
      System.out.println();
    }
  }
}