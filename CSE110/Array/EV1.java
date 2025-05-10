import java.util.Scanner;
public class EV1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
            System.out.print("N:");
            int N = input.nextInt();
            int array [] = new int[N];
            
            for(int index=0; index<N; index++){                
                array[index]= input.nextInt();
            }
            for(int i=0; i<N; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
            for(int i=0; i<N; i++){
                if(array[i]<0){
                    array[i] = 0;
                }
                System.out.print(array[i]+" ");
            }
    }
}