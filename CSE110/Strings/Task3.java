import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String value = input.nextLine();
        int length = value.length();
        boolean isBinary = true;

        for (int i = 0; i < length; i++) {
            char ch = value.charAt(i);
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }

        if (isBinary) {
            System.out.println("Binary Number");
        }
        else {
            System.out.println("Not a Binary Number");
        }
        
       
    }
}
