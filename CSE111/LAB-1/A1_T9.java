//Task 9
public class A1_T9
{
  public static void main(String[]args)
  {
    
    int N = 3;
    int arr1 [][]  = {{1, 0, 0},
      {0, 1, 0},
      {0, 0, 1}};   
    
    for(int i = 0; i < N; i++)
    {
      for(int j = 0; j< N; j++)
      {
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
    boolean indentity = true;
    for(int i = 0; i < N; i++)
    {
      for(int j = 0; j< N; j++)
      {
        if( i == j && arr1[i][j] != 1)
        {
          indentity = false; 
          break;
        }
        else if (i != j && arr1[i][j] > 0 )
        {
          indentity = false;
          break;
        }
      }
      if(!indentity)
      {
        break;
      }
      
    }
    if(indentity)
    {
      System.out.print("Identity Matrix");
    }
    else
    {
      System.out.print("Not an identity Matrix");
    }
    
  }
}