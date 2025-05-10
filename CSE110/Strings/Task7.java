import java.util.Scanner;
public class Task7 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
        int length = word.length();
        int upper_case=0;
        int lower_case=0;
        int digits=0;
        int sp=0;
        for(int i=0; i<=length-1;i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper_case++;    
            }
            else if(ch>='a' && ch<='z'){
                lower_case++;
            }
            else if(ch>='0' && ch<='9'){
                digits++;
            }
            else{
                sp++;
            }
        }
        System.out.println(upper_case);
        System.out.println(lower_case);
        System.out.println(digits);
        System.out.println(sp);
    }
}
