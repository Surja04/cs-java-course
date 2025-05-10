import java.util.Scanner;
public class Task6_trash {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
        int length = word.length();
        int vowels=0;
        int consonants=0;
        for(int i=0; i<=length-1;i++){
            char ch=word.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A'||ch=='E'|| ch=='O'||ch=='I'||ch=='U'){
                vowels++;    
            }
            else {
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }   
}
