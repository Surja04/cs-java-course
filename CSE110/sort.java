import java.util.Scanner;
public class sort
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    int N = input.nextInt();
    int arr [] = new int [N];
    
    for(int i = 0; i < N; i++)
    {
      arr[i] = input.nextInt();
      
    }
    int max_value = 0;
    for(int i=0; i< arr.length-1; i++)
    {
      max_value = i;
      for(int j = i+1; j < arr.length; j++ )
      {
        if(arr[max_value] < arr[j])
        {
           max_value = j;
        }

      }
        int temp = arr[i];
        arr[i] = arr[max_value];
        arr[max_value]=temp;
    }
        for(int i = 0; i < N; i++)
    {
      System.out.println(arr[i]);
      
    }
    
  }
}