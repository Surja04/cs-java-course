import java.util.Scanner;
public class Cw_1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String str1=input.nextLine();
        String upper_str1="";
        for(int i=0; i<str1.length(); i++){
            char current_char = str1.charAt(i);
            int current_char_ascii=(int) current_char;
            if(current_char_ascii>=65 && current_char_ascii<=90){
                upper_str1+=current_char;
            }
            else if(current_char_ascii>=97 && current_char_ascii<=122){
                char upper_character=(char)(current_char_ascii-32);
                upper_str1+=upper_character;
            }
            else{
                upper_str1+=current_char;
            }
        }
        System.out.println(upper_str1);
    }   
}
