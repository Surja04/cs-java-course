public class quiz_5 {
    public static void main(String[]args){
        int arr[] = {4,5,6,7,11};
      int sub_array[]=(subArray_Finder(arr,1,3));
    
      for(int i=0; i<sub_array.length; i++){
          System.out.print(sub_array[i]+" ");
      }
    }
    public static int[] subArray_Finder(int arr1[],int a,int b){
        int sub_arr[]=new int[3];
       
        for(int i= 0; i<b; i++){
            sub_arr[i] = arr1[i+1];
            
        }
        return sub_arr;
         
    }
}