//Task6
import java.util.Scanner;
public class A1_T6
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
    System.out.print("N = ");
    int N = input.nextInt(); 
    int arr1 [] = new int [N];
    for(int i = 0; i < arr1.length; i++)
    {
      arr1[i]=input.nextInt();
    }
    int count = 0;
    boolean arr2 [] =  new boolean [N];
    for(int i = 0; i < arr1.length-1; i++)
    {
      count = 1;
      
      for(int j = i+1; j < arr1.length; j++)
      {
        if(arr2[j]==false){
          if(arr1[i]==arr1[j])
          {
            arr2[j] = true;          
            count++;         
          }        
        }
        else
        {
          break;
        }
      }
      if(arr2[i]==false)
      {
         System.out.println(arr1[i]+"-"+count+" times");
      }     
    }  
  }
  
}