//Task 01: Merge Sorted Array
class Task1{
  
  //Complete this method so that it gives the Expected Output
  public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){
    
    Integer arr3[] = new Integer [arr1.length + arr2.length];
    int idx1 = 0;
    int idx2 = 0;
    int idx3 = 0;
    
    while(idx1 < arr1.length && idx2 < arr2.length)
    {
      if(arr1[idx1] < arr2[idx2])
      {
        arr3[idx3] = arr1[idx1];
        idx3++;
        idx1++;
      }
      else
      {
        arr3[idx3] = arr2[idx2];
        idx3++;
        idx2++;
      }
    }
    while(idx1 < arr1.length)
    {
      arr3[idx3] = arr1[idx1];
      idx1++;
      idx3++;
    }
    while(idx2 < arr2.length)
    {
      arr3[idx3] = arr2[idx2];
      idx2++;
      idx3++;
    }
//    for(int i = 0 ; i<arr3.length; i++)
//    {
//      System.out.print(arr3[i]+" ");
//    }
    return arr3;
    
  }
  
  //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
  public static void main(String[] args){
    Integer[] a1 = {1, 2, 3};
    Integer[] a2 = {2, 5, 6};
    System.out.print("Array 1: ");
    Arr.print(a1);
    System.out.print("Array 2: ");
    Arr.print(a2);
    System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
    Integer[] returned_val_1 = mergeSortedArray(a1, a2);
    System.out.print("Your Output: ");
    Arr.print(returned_val_1);
    System.out.print("\n======================\n");
    Integer[] a3 = {1, 3, 5, 11};
    Integer[] a4 = {2, 7, 8};
    System.out.print("\nArray 3: ");
    Arr.print(a3);
    System.out.print("Array 4: ");
    Arr.print(a4);
    System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
    Integer[] returned_val_2 = mergeSortedArray( a3, a4);
    System.out.print("Your Output: ");
    Arr.print(returned_val_2);
  }
}
