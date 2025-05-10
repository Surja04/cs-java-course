import java.util.Scanner;
public class A8_EV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        int N = scanner.nextInt();      
        int[] array = new int[N];       
     
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

       
        for (int i = 0; i < N; i++) {
            if (array[i] > 0) {
                array[i] = 1;
            } else if (array[i] < 0) {
                array[i] = 0;
            }
           
        }

        System.out.println("After modifying:");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();        
    }
}
