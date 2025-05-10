import java.util.Scanner;
public class A8_HW1{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the length of an array: ");
       int n = input.nextInt();
      double arr [] = new double [n];
      //a
      int MaxArrayIndex = 0;
      double MaxArrayValue = arr[0];
      for(int i=0; i < n; i++){

          System.out.print("Enter a Number:");
          arr[i] = input.nextDouble();
      }
      for(int i=0; i < n; i++){
        if(MaxArrayValue < arr[i]){
           MaxArrayValue = arr[i];
           MaxArrayIndex = i;
        }
      }
      //b
      int MinArrayIndex = 0;
      double MinArrayValue = arr[0];
      for(int i=0; i < n; i++){
        if(MinArrayValue > arr[i]){
          MinArrayValue = arr[i];
          MinArrayIndex = i;
        }
      }
      System.out.println("Max element "+MaxArrayValue+" "+"found at index "+MaxArrayIndex);
      System.out.println("Min element "+MinArrayValue+" "+"found at index "+MinArrayIndex);
      
      //c
      double sum = 0;
      for(int i=0; i < n; i++){
         sum = sum + arr[i]; 
      }
      System.out.println("Summation: "+sum);
      
      //d
      double avg = 0;
      System.out.println("Average: "+ sum/n);
  }
}