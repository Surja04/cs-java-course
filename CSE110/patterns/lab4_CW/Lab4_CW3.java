import java.util.Scanner;

public class Lab4_CW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int height = scanner.nextInt();

        for (int i =1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= height; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
