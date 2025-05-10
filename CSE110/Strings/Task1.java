import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    String str1=input.nextLine();
    int length = str1.length();
    for(int i=length-1; i>=0; i--){
        char reverse = str1.charAt(i);
        System.out.print(reverse);
    }
    
    }   
}
