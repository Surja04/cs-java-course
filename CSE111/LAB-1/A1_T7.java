//Task7
import java.util.Scanner;
public class A1_T7
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.print("N = ");
    int n = input.nextInt();
    double arr1 [] = new double [n];
    System.out.println("Please enter the elements of the array:");
    for(int i = 0; i < n; i++ )
    {
      arr1[i] = input.nextDouble();
    }
    double arr2 [] = new double [n];
    int index = 0;
    boolean isConsequtive = false;
    int removedElements = 0;
    for(int i = 0; i < arr1.length-1; i++)
    {
      isConsequtive = false;
      for(int j = i+1; j < arr1.length; j++)
      {
         
        
        if(arr1[i]==arr1[j])
        {
          isConsequtive = true;          
          break;          
        }        
        else
        {
          arr2[index] = arr1[i];          
          index++;
          break;
        }
      }
      if(isConsequtive)
      {
        removedElements++;
      }
      
    }
    arr2[index] = arr1[arr1.length-1];
    index++;
    
    System.out.println();
    System.out.print("New Array: ");
    for(int i = 0; i < index; i++ )
    {
      System.out.print(arr2[i]+" ");
    }
    System.out.println();
    System.out.print("Removed elements : "+removedElements);
  }
  
}