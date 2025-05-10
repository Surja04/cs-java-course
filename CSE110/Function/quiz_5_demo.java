public class quiz_5_demo {
    public static void main(String[]args){
        int arr[] = {4,5,6,7,11};
        System.out.print(subArray_Finder(arr,1,3));
    }
    public static int[] subArray_Finder(int arr1[],int a,int b){
        int sub_length = b - a + 1; // Calculate the length of the sub-array
        int sub_arr[] = new int[sub_length]; // Create sub-array with appropriate length
        for (int i = 0; i < sub_length; i++) {
            sub_arr[i] = arr1[a + i]; // Copy elements from arr1 to sub_arr
        }
        return sub_arr; // Return the sub-array
    }
    
}