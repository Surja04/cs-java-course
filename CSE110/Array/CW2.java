public class CW2{
    public static void main(String[]args){
        int arr [] = {9,-5, 7, 9,-5, 5, 7};
        int length = arr.length;
        System.out.println("Before removing the duplicates:");
        for(int index=0; index<length; index++){
            System.out.print(arr[index]+" ");
        }
        System.out.println();
        System.out.println("After removing the duplicates:");
        
        for(int i=0; i<length; i++){
            for(int j=i+1; j<7; j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
            
            System.out.print(arr[i]+" ");
        }
    }
}