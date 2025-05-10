public class voga{
    public static void main (String[]args){
        int arr1 [] = {23, 100, 23, 56, 100};
        int arr2 [] = new int [arr1.length];
        
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        
        int current_index = 0;
        arr2 [current_index] = arr1[0];
        
        for(int i=1; i<arr1.length; i++){
            int j;
            boolean found = false;
            for( j=0; j<arr2.length; j++ ){
                if(arr1[i] == arr2[j] ){
                    found=true;
                    break;
                }
            }
            if(!found){
                current_index++;
                arr2[current_index]=arr1[i];        
            }
        }
        System.out.println();
        for(int i = 0; i <= current_index; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}