public class quiz 
{
  public static void main(String [] args)
  {
    int arr1 [] = {5, 7, 2, 3, 6, 4};
    UpgradedArray(arr1);
  }
  public static void UpgradedArray(int arr2 [])
  {
    int sum = 0;
    for(int i=0; i < arr2.length; i++ )
    {
      sum = 0;
      int j = i;
      for(int k = 0; k < arr2.length; k++)
      {
        if(k != j)
        {
          sum = sum + arr2[k];
        }
      }
      int temp = arr2[i];
      arr2[i] = sum;
      System.out.println(arr2[i]);
      arr2[i] = temp;
      
    }
  }
}