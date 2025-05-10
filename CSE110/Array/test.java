import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N:");
        int N = input.nextInt();
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        for (int j = 0; j < N; j++) {
            System.out.print(array[j] + " ");
        }
        int array_2[] = new int[N];
        int num = N - 1; // Initialize num outside the loop
        for (int i = 0; i < N; i++) {
            array_2[num] = array[i];
            num--; // Decrement num inside the loop
        }
        for (int i = 0; i < N; i++) {
            System.out.print(array_2[i] + " ");
        }
    }
}
