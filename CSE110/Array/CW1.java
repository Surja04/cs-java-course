import java.util.Scanner;
public class CW1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
            System.out.print("N:");
            int N = input.nextInt();
            int array [] = new int[N];
            int length = array.length;
            
            for(int index=0; index<=length-1; index++){
                System.out.print("Enter a Number:");
                array[index]= input.nextInt();
            }
            for(int i=0; i<=length-1; i++){
                System.out.println(i + ":" + array[i]);
            }

            int resized_array[] =new int [N+1];//6
            int length_2 = resized_array.length;
            
            for (int j = 0; j < length; j++) {//5
            resized_array[j] = array[j];
            }
            System.out.print("Enter another number: ");
            resized_array[N] = input.nextInt();
            
            for(int z=0; z<length_2; z++ ){
                System.out.print(resized_array[z]+" ");
            }
            
            
            

            
        }
    
    }
    

