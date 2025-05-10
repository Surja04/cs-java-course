import java.util.Scanner;
public class CW3_ownversion_b {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
            System.out.print("N:");
            int N = input.nextInt();
            int array [] = new int[N];
           
            for(int i=0; i<N; i++){
                array[i] = input.nextInt();
            }
            for(int j=0; j<N; j++){
                System.out.print(array[j]+" ");
            }
            int temp;
            int num = N-1;            
            for(int i=0; i<N/2; i++){               
                 temp = array[i];//array[0]=1
                 array[i]=array[num];//array[0]=4
                 array[num] = temp;//array[3]=1;
                 num--;           
               
            }
            System.out.println();
            for(int i=0; i<N; i++){
                System.out.print(array[i]+" ");
            }

    }
}