import java.util.Scanner;
public class Task6_final {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
        int length = word.length();
        int vowels=0;
        int consonants=0;
        for(int i=0; i<=length-1;i++){
            char ch=word.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
                vowels++;    
            }
            else if(ch=='A'||ch=='E'|| ch=='O'||ch=='I'||ch=='U'){
                vowels++;
            }
            else if(ch>='a'&& ch<='z'){
                consonants++;
            }
            else if(ch>='A'&& ch<='Z'){
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }   
}
