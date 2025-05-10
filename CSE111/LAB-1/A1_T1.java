//Task1
import java.util.Scanner;
public class A1_T1
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    int n = 10;
    int arr [] = new int [n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = input.nextInt();
    }
    int sum = 0;
    int max = arr[0];
    int min = arr[0];
    int count = 0;
    for(int i = 0; i < n; i++)
    {
      if(arr[i]%2 != 0 && arr[i] > 0)
      {
        sum = sum+arr[i];
        count++;
      }
    }
    for(int i = 0; i < n; i++)
    {
      if(arr[i]%2 != 0 && arr[i] > 0)
      {
        if(arr[i]>max)
        {
          max = arr[i];
        }
        
      }
    }
    for(int i = 0; i < n; i++)
    {
      if(arr[i]%2 != 0 && arr[i] > 0)
      {
        if(arr[i]<min)
        {
          min = arr[i];
        }
        
      }
    }
    
    System.out.println("Sum = "+sum);
    double average = (double)sum/count;
    System.out.println("Minimum = "+min);
    System.out.println("Maximum = "+max);    
    System.out.println("Average = "+average);
    if(count == 0)
    {
      System.out.print("No odd positive numbers found");
    }
  }
}