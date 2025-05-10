import java.util.Scanner;
public class Task4 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word = input.next();
        int length = word.length();
        
        for(int i=0; i<= length-1; i++ ){
            char ch=word.charAt(i);
             System.out.print(ch+" :");
             int ascii_code=(int)ch;
             System.out.println(ascii_code);
        }
       
    }
    
}
