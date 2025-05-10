import java.util.Scanner;

public class FriendsProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of problems
        int n = scanner.nextInt();
        
        int count = 0;  // To store the number of problems they will implement
        
        // Iterate through each problem
        for (int i = 1; i <= n; i++) {
            // Read the three integers (Petya's, Vasya's, and Tonya's confidence)
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // Check if at least two of them are sure about the solution
            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }
        
        // Output the result
        System.out.println(count);
        
        scanner.close();
    }
}
