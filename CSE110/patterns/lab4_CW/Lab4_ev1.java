import java.util.Scanner;

public class Lab4_ev1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int length = scanner.nextInt();


        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}