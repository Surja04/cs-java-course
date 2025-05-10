public class task13_demo_2 {
    public static void main(String[] args) {
        String str = "Abraca Dabra";
        String new_word = "" + str.charAt(0); // Initialize new_word with the first character of str
        
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false; // Initialize a boolean flag to check if the character is already in new_word
            for (int j = 0; j < new_word.length(); j++) {
                if (ch == new_word.charAt(j)) {
                    found = true;
                    break; // If the character is found, no need to continue searching
                }
            }
            if (!found) {
                new_word += ch; // If the character is not found, add it to new_word
            }
        }
        System.out.print(new_word);
    }
}
