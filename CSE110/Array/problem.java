import java.util.Scanner;
public class problem{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int N = 5;
        int array[] = new int [N];
        int length = array.length;
        boolean match = false;
        
        for(int index=0; index<=length-1; index++){
            array[index] = input.nextInt();
        }
        System.out.print("Enter the target value:");
        int target = input.nextInt();
        
        for(int i=0; i<=length-1; i++){
                int j;
            for( j=i+1; j<=length-1; j++){
                int sum = array[i] + array[j];
                 
                if(sum==target){
                    System.out.println("Elements That are needed to be added:"+array[i]+" "+array[j]);
                    match = true;
                    break;
                }
            }
            
            if(match){
                System.out.print("Index of the elements:"+ i +" "+j);
                break;
            }
        }

      
    }
}