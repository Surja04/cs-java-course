import java.util.Scanner;
public class Add_task_4
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    
    int  A[][] = {{4,5,7},
      {0,3,-2},
      {4,1,-4},
      {5,10,1}}; 
    int M = A.length;
    int N = A[0].length;
    int k = input.nextInt();
    
    for(int i = 0; i < M; i++)
    {
      for(int j = 0; j < N; j++)
      {
        A[i][j] = k*A[i][j];
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
  }
}