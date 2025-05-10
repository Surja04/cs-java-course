import java.util.Scanner;
public class A8_HW3{
  public static void main(String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter the length of array1:");
    int n = input.nextInt();
    int arr1 [] = new int [n];
    
    System.out.println( "Please enter the elements of the arr1:");
    
    for(int i = 0; i < n; i++){
      arr1[i] = input.nextInt();
    }
    System.out.println("Please enter the length of array2:");
    
    int k = input.nextInt();
    int arr2 [] = new int [k];
    
    System.out.println( "Please enter the elements of the arr2:");
    
    for(int i = 0; i < k; i++){
      arr2[i] = input.nextInt();
    }
    
    boolean isSubSet = false;
//    int count = 0;
    
    for(int j = 0; j < k; j++){        
      isSubSet = false;
      for(int i = 0; i < n; i++){
        if(arr2[j] == arr1[i]){
          isSubSet = true;
          break;
        }
      }
      
      if(!isSubSet){
         break;
      }
    }
    
    if(!isSubSet){
      System.out.print( "Array2 is not a subset of Array1.");
    }
    if(isSubSet){
      System.out.print( "Array2 is a subset of Array1.");
    }
  }
}