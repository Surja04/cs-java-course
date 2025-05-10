public class mock_quiz_2_demo {
    public static void main(String[] args) {
        String new_word = create_String("Hello", "World");
        System.out.print(new_word);
    }

    public static String create_String(String w1, String w2) {
        String new_word = "";

        for (int i = 0, j = w2.length() - 1; i < w1.length() && j >= 0; i++, j--) {
            new_word += w1.charAt(i) + w2.charAt(j);
        }
        return new_word;
    }
}
