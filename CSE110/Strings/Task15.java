import java.util.Scanner;
public class Task15 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
//        String new_word = "";
        int length= word.length();
        for(int i=0; i<=length-1; i++){
            char ch = word.charAt(i);
            int ascii_code=(int)ch;
            if((ascii_code>=65 && ascii_code<=90) || (ascii_code>=97 && ascii_code<=122) || (ch>='0' && ch<='9')){
//                new_word+=(char)ascii_code;
                System.out.print(ch);
            }            
            else{
                System.out.println(" ");                                      
            }            
        }        
    }   
}
