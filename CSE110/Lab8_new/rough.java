import java.util.Scanner;
public class rough{
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
    for(int i = 0; i < k; i++){
        isSubSet = false;
        for(int j=0; j < n; j++){
          if(arr2[i]==arr1[j]){
              isSubSet = true;
              break;
          }
        }
        if(!isSubSet){
           break;
        }
    }
    if(isSubSet){
      System.out.print("Array2 is a subset of Array1");
    }
    else{
       System.out.print("Array2 is not a subset of Array1");
    }
  }
}