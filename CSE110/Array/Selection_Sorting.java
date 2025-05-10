public class Selection_Sorting {
    public static void main(String[]args){
        int array [] = {10,25,20};
        int length = array.length;        
        for(int i=0; i<length-1; i++){
            int min_index = i;//1
            for(int j = i+1; j<length; j++){//2
                if(array[j]<array[min_index]){//20<25 true
                    min_index=j; //2(20)                   
                }
            }
            int temp = array[min_index];//20
            array[min_index]=array[i];//25
            array[i]= temp; //20           
        }
        for(int index=0; index<=length-1; index++){
            System.out.print(array[index]+ " ");
        }
        
    }
}
