public class Quiz_5_2{
    public static void main(String[]args){
        int [ ] arr1 = {4,5,6,7,11};
        int [ ] arr2 = {55, 88, 9, 0, -12, 67};
        
        int [ ] arr3 = array_merger(arr1,arr2);
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }

    }
    public static int[] array_merger(int a1 [], int a2 []){

        int a3 [] = new int [a1.length+a2.length];
        
        for(int i = 0; i < a1.length; i++){
            a3[i] = a1[i];
        }
        int num = 0;
        for(int j = a1.length; j < a1.length+a2.length; j++){
            a3 [j] = a2[num];
            num++;
//            System.out.print(num+" "+ a3[j] );
        }
        return a3;
    }
} 