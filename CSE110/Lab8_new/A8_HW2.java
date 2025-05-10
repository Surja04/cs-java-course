public class A8_HW2{
  public static void main(String[]args){
    int arr1 [] = {-5,10,-7,-5};
    int arr2 [] = new int [arr1.length];
    int index = 0;
    int CurrentElement = 0;
    for(int i = 0; i < arr1.length; i++){
      CurrentElement = arr1[i];//23,100      
       boolean isduplicate = false; 
      for(int j = 0; j < index; j++){             
                   
        if(arr2[j] == CurrentElement){  
          isduplicate = true;
          break;
        }
      }
      if(!isduplicate){
        arr2[index] = CurrentElement;
        index++;
      }      
    }
    for(int j = 0; j < index ; j++ ){
      System.out.print(arr2[j]+ " ");
    }
  }
}