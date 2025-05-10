import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        String new_word = "";
        int length = word.length();
        int vowels = 0;
        int consonants = 0;

        // Convert the input string to lowercase
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            int ascii_code = (int) ch;

            if (ascii_code >= 97 && ascii_code <= 122) {
                new_word += (char) ascii_code;
            }
            else if (ascii_code >= 65 && ascii_code <= 90) {
                ascii_code = ascii_code + 32;
                new_word += (char) ascii_code;
            } 
            else {
                new_word += (char) ascii_code;
            }
        }

        // Count vowels and consonants in the new_word
        length = new_word.length();
        for (int i = 0; i < length; i++) {
            char ch = new_word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Print counts of vowels and consonants
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

    }
}
