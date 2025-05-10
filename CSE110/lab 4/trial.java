import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();
        int num_2 = input.nextInt();

        for (int i = num_1; i <= num_2; i++) {
            int originalNumber = i;
            int count = 0;
            double sum = 0;

            // Calculate the number of digits
            int temp = originalNumber;
            while (temp != 0) {
                temp /= 10;
                count++;
            }

            // Calculate the sum of the digits raised to the power of 'count'
            temp = originalNumber;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }

            // Check if the sum is equal to the original number
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}
