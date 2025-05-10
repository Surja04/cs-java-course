public class Task
{
  public static void main(String[]args)
  {
    
    int n = 10;
    System.out.println("The odd numbers are:");
    int num = 1;
    int sum = 0;
    
    for(int i = 0; i<n; i++ )
    {
      
      sum = sum+num;
      System.out.println("Current Number "+num+","+" Sum: "+sum);  
      num+=1;     
    }    
  }
}