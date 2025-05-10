import java.util.Scanner;
public class CW3{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print( "Enter the length of the array:");
        int N = input.nextInt();
        int array[] = new int [N];
        int length = array.length;
        
        for(int index = 0; index<length; index++){
            System.out.print("Enter a number:");
            array[index]=input.nextInt();
        }
        for(int j=0; j<length; j++){
            System.out.print(array[j]+" ");
        }
        int new_array[] = new int [N];
        int i;
        
        for(i=length-1; i>=0; i--){
            new_array[length-1-i]=array[i];            
        }        
    }
}