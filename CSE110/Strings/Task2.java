import java.util.Scanner;
    public class Task2 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word=input.nextLine();
        int index_no=input.nextInt();
        int length = word.length();
        String new_word="";
        for(int i=index_no; i>=0; i--){
            char reverse_words = word.charAt(i);//Make contact with the reverse words;
            new_word+=reverse_words;

        }
        if(index_no+1<=length-1){
            for(int j=index_no+1; j<=length-1;j++ ){
                char anti_reversed_words= word.charAt(j);
                new_word+=anti_reversed_words;
            }
        }
        System.out.print(new_word);
        
    }   
}
