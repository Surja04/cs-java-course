import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the number of statements
        int n = sc.nextInt();
        int x = 0; // Initialize x to 0

        // Loop through the statements
        for (int i = 0; i < n; i++) {
            // Read the current statement
            String statement = sc.next();

            // Check if the statement contains "++", if so increase x
            if (statement.contains("++")) {
                x++;
            } 
            // Else decrease x (for "--")
            else if (statement.contains("--")) {
                x--;
            }
        }

        // Output the final value of x
        System.out.println(x);
    }
}
