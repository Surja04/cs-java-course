import java.util.Scanner;
public class t4 {
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int n1=input.nextInt();
    int j=n1;
    int n2 = n1;
    int count=0;
    double sum = 0;
    int sum1 = 0;
    
    
    while(j!=0){
      j=j/10;
      count++;
    }
 
    
    double power=Math.pow(10,(count-1));
    int pow=(int)power;
    while(n1!=0){
      int quotient=n1/pow;
       sum = sum+Math.pow(quotient,count);
       sum1= (int) sum;
      
      n1=n1 % pow;
      pow=pow/10;
      
    }
    System.out.print(sum1);
   
  }  
}
