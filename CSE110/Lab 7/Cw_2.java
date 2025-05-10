import java.util.Scanner;

public class Cw_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        String input = scanner.nextLine();
        

        boolean isPalindrome = true;
        int length = input.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
