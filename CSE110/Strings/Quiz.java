import java.util.Scanner;
public class Quiz {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word=input.nextLine();
        String new_word="";
        int length = word.length();
        
        for(int i=0; i<=length-1; i++){
            char ch=word.charAt(i);
            int ascii_code=(int)ch;
            if(i%2==0 && ascii_code%2!=0){
            new_word+=(char)ascii_code;
            }
        }
        System.out.print("New value = "+new_word);
            
        
    }  
}
