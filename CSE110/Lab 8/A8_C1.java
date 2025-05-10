import java.util.Scanner;

public class A8_C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int N = scanner.nextInt();       
        int[] array = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        // Print the elements of the array with their indices
        System.out.println("The elements of the array are:");
        for (int i = 0; i < N; i++) {
            System.out.println(i + ": " + array[i]);
        }

        // Resize the array and add a new integer value
        int[] resizedArray = new int[N + 1];
        for (int i = 0; i < N; i++) {
            resizedArray[i] = array[i];
        }
        System.out.print("Enter another number: ");
        resizedArray[N] = scanner.nextInt();

        // Print the resized array
        System.out.println("After resizing the array:");
        for (int num : resizedArray) {
            System.out.print(num + " ");
        }
    }
}