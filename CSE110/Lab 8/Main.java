import java.util.Scanner;
class Main{
    public static boolean isPrime(int n){
        int count = 0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0){count++;
            }
        }
        if (count==2){
            return true;}
        else  {
            return false;}
    } 
    
    public static void main (String []args){
        Scanner sc = new Scanner ( System.in);
        System.out.print (" Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime= isPrime(n);
        System.out.print(isPrime);
    }
}