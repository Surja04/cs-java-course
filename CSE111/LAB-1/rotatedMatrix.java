public class rotatedMatrix
{
  public static void main(String[]args)
  {
    int [][] mat = { {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    int row = mat.length;
    int col = mat[0].length;
    int [][] my_arr = new int[row][col];
    
    int k=0;
    int z=col-1;
    for(int i = 0; i < row; i++)
    {
      k=0; 
      for(int j = 0; j < col; j++)
      {
        my_arr[k][z] = mat[i][j];
        k++;
      }
      z--;
    }
    for(int i = 0; i < row; i++)
    {
      for(int j = 0; j < col; j++)
      {
        System.out.print(my_arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
