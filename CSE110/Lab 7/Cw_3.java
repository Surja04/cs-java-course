public class Cw_3{
    public static void main(String[] args) {
        String input = "I-love-Java,tom@gmail,harry@yahoo,bob@gmail";       
        char split_character = ',';        
        int splitIndex = 0;       
        String substring = "";   
        while (splitIndex < input.length()) {            
            char c = input.charAt(splitIndex);            
            if (c != split_character) {
                substring += c;
            }            
            else {
                System.out.println(substring);
                substring = "";
            }           
            splitIndex++;
        }        
        System.out.println(substring);
    }
}
