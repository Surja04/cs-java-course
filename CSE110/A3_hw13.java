//import java.util.Scanner;
public class A3_hw13 {
  public static void main(String[]args){
//    Scanner input=new Scanner(System.in);
    int num=32768;
    int temp=num;
    int count=0;    
    while(temp != 0){
      temp=temp/10;
      count++;
    }   
    double fact = 1.0;
    double power = 10.0;
    for(int i = 1; i < count; i++ )
    {
      fact = power*fact;
    }
    int power1=(int)fact;
    
    
    while(num!=0){
      int digit=num/power1;
      if(power1==1){
        System.out.print(digit);
      }
      else{
        System.out.print(digit+",");
      }
      num=num%power1;
      power1=power1/10;
      
    }
    
    
  }
}
