import java.util.Scanner;
public class CW3_ownversion_a {
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
            int array_2[] = new int [N];
            int num=N-1;
            for(int i=0; i<N;i++){
                
                array_2[num] = array[i];
                       //3     //0=1;//array_2[3]=1
                       //2     //1=2;//array_2[2]=2
                       //1     //2=3;//array_2[1]=3
                num--;
                
            }
            System.out.println();
            for(int i=0; i<N; i++){
                System.out.print(array_2[i]+" ");
            }
    }
}