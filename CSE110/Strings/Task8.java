import java.util.Scanner;
public class Task8 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
        int length = word.length();
        int sp=0; 
        for(int i=0; i<=length-1;i++){
            char ch=word.charAt(i);
            if(ch=='#' || ch=='!'||ch=='&'||ch=='&'){
                sp++;        
            }
        }
        System.out.println(sp);
    }
}

