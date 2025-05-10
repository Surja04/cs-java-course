import java.util.Scanner;

public class Lab4_cw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int height = scanner.nextInt();

        
        for (int i = 1; i <= height; i++) {
           
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
       
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
