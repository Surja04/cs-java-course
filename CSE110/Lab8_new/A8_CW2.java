public class A8_CW2{
  public static void main(String[]args){
    int arr [] = {9,-5,7,9,-5,5,7};
    int leng = arr.length;
    System.out.println("Before removing duplicates:");
    for(int i = 0; i < leng; i++ ){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("After replacing duplicates with 0:");
    
    for(int i = 0; i < leng; i++){
      for(int j=i+1; j < leng-1; j++){
        if(arr[i]==arr[j]){
            arr[j] = 0;
        }
      } 
    }
    for(int i = 0; i < leng; i++){
         System.out.print(arr[i]+" ");
    }
  }
}