/*Write a Java program that takes two strings (lowercase) as user input.
Your task is to concat the two strings except the common characters
present in the strings. Then print the modified string (uppercase).
You can assume that each string will only contain unique characters; 
that means there will be no duplicate characters in a particular string.*/

public class String_problem{
    public static void main(String[]args){
//        Scanner input = new Scanner (System.in);
        
        String str_1 = "abcd";
        String str_2 = "bdgc";
        String new_word = "";
        
        boolean common = false;
        
        for(int i=0; i<str_1.length(); i++){
            common = false;
            for(int j = 0; j<str_2.length(); j++){
                if(str_1.charAt(i)==str_2.charAt(j)){
                    common=true;
                    break;
                }
            }
            if(!common){
                new_word+=str_1.charAt(i);
            }
        }
        for(int i=0; i<str_2.length(); i++){
            common = false;
            for(int j = 0; j<str_1.length(); j++){
                if(str_2.charAt(i)==str_1.charAt(j)){
                    common=true;
                    break;
                }
            }
            if(!common){
                new_word+=str_2.charAt(i);
            }
        }
        System.out.print(new_word);
        
        System.out.println();
        
        String uppercase= "";
        
        for(int i=0; i < new_word.length(); i++){
            char ch = new_word.charAt(i);
            int ascii_code = (int)ch;
            
            if(ascii_code>=97 && ascii_code<=122){
                ascii_code = ascii_code -32;
                uppercase =uppercase + (char)ascii_code;
            }
        }
        System.out.print(uppercase);
        
    }
}