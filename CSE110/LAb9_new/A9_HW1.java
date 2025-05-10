import java.util.Scanner;
public class A9_HW1
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    
    // A
      boolean check = isPrime(15);
      System.out.println(check);
    //B
       check = isPerfect(6);
       System.out.println(check);
    //C
       int n = input.nextInt();
       special_sum(n);
      
  }
  public static boolean isPrime(int a)
  {
    boolean is_prime = true;
    for(int i = 2; i < a; i++)
    {
      if(a%i == 0)
      {
         is_prime = false;
           break;
      }
      
    }
    return is_prime;
  }
  public static boolean isPerfect(int a)
  {
    boolean is_perfect = false;
    int sum = 0;
    for(int i = 1; i < a; i++)
    {
      if(i%2 == 0)
      {
       sum = sum+i;
      }
    }
 
    if(sum == a)
    {
      is_perfect = true;
    }
    return is_perfect;
  }
  public static void special_sum (int a)
  {
    int specialSum = 0;
    for(int i = 2; i < a; i++){
        if(isPerfect(i) || isPrime(i))
        {
           specialSum =  specialSum+i;
        }
    }
    System.out.print(specialSum);
  }
}