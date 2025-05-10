import java.util.Scanner;
public class HW4{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.print(" Please enter the length of array:");  
        int N = input.nextInt();    
        int arr_1[] =new int[N]; 
        
        System.out.println(" Please enter the elements of the array:");
        
        for(int index=0; index < N; index++){
            arr_1[index]=input.nextInt();
        }
        System.out.print("Please enter the target value:");
        int target_value = input.nextInt();
        int sum =0;
        boolean found=false;
        for(int i=0; i < N; i++){
            int j;
            for( j=i+1; j<N; j++){
                sum = arr_1[i]+arr_1[j];
                if(sum==target_value){
                    System.out.print("Elements That are needed to be added:"+arr_1[i]+" "+arr_1[j]);
                    found=true ;
                    break;
                }
            }
            if(found){
                System.out.print("Index of the elements:"+ i +" "+j);
                break;
            }
            
        }
    }
}