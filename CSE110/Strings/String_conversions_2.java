import java.util.Scanner;
public class String_conversions_2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String new_word = "";
        int length = word.length();
        
        for(int i=0; i<length; i++){
            int ch = word.charAt(i);
            int ascii_code = (int)ch;
            
            if(ascii_code >= 97 && ascii_code <= 122){
                new_word += (char)ascii_code;
            }
            else if(ascii_code >= 65 && ascii_code <= 90){
                ascii_code = ascii_code+32;
                new_word+=(char)ascii_code;
            }
            else{
                new_word += (char)ascii_code;
            }
            
        }
        System.out.print(new_word);
        
      
    }
   
}
