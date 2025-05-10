import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = input.nextInt();
        int originalNumber = n1; // Store the original number
        int count = 0;
        double sum = 0;

        // Count the number of digits
        int temp = n1;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Calculate the sum of digits raised to the power of the number of digits
        temp = n1; // Reset temp to the original number
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }

        // Check if the sum equals the original number
        if ((int) sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
