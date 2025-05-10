import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of perfect numbers to find: ");
        int n = scanner.nextInt();
        
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPerfect(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
