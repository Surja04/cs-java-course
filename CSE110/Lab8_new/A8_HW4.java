import java.util.Scanner;
public class A8_HW4{
  public static void main(String [] args){
      Scanner input = new Scanner (System.in);
      System.out.print("Please enter the length of array:");
      int n = input.nextInt();
      int arr1 [] = new int [n];
      System.out.println("Please enter the elements of the array:");
      
      for(int i = 0 ; i < n; i++){
          arr1[i] = input.nextInt();
      }
      
      System.out.print("Please Enter the target value:");
      int num = input.nextInt();
      int sum = 0;
      int index1 = 0;
      int index2 = 0;
      int element1 = 0;
      int element2 = 0;
      boolean found = false;
      for(int i = 0; i < n-1; i++){
          sum = 0;
          found = false;
          for(int j = i+1; j < n; j++){
              sum = arr1[i] + arr1[j];
              if(sum == num){
                found = true;
                 index1 = i;
                 index2 = j;
                 element1 = arr1[i];
                 element2 = arr1[j];
                 break;
              }
          }
          if(found){
             break;
          }   
      }
      if(!found){
          System.out.print("Target value not found");
      }
      else{
          System.out.println("Elements need to be added: "+element1+" "+element2);
          System.out.print("Index of the elements: "+ index1+" "+index2);
      }
      
  }
}
