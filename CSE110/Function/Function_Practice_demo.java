import java.util.Scanner;

public class Function_Practice_demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int pos = input.nextInt();
         
        System.out.print(function_name(sentence, pos));
    }

    public static String function_name(String sen, int position) {
        String first_str = "";
        String last_str = "";

        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);
            if (i % 3 != 0) { // Change the condition here
                first_str = first_str + ch;
            } else {
                last_str = last_str + ch;
            }
        }
        String add = first_str + last_str;
        return add;
    }
}
