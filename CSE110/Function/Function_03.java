import java.util.Scanner;
public class Function_03{
    public static int function_name(String wrds){
        int leng = wrds.length();
        int upper_count = 0;
        int lower_count = 0;
        
        for(int i=0; i<leng; i++){
            char ch = wrds.charAt(i);
            int ascii_value = (int)ch;
            
            if(ascii_value>=65 && ascii_value<=90){
                upper_count++;
            }
            else if(ascii_value>=97 && ascii_value<=122){
                lower_count++;
            }
            
            
        }
        return upper_count;
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter String:");
        String words = input.nextLine();
        int result=function_name(words);
        System.out.print("No. of uppercase characters:"+result);
        
    }
}