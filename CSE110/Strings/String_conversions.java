
public class String_conversions {
    public static void main(String[]args){
    String word="ChRiStsMaS,, Is a MyTH";
    String new_word="";
    int length= word.length();
    for(int i=0; i<length; i++){
        char ch=word.charAt(i);
        int convert=(int)ch;//converting to ascii
        
        if(convert>=97 && convert<=122){
            int new_asci_code=convert-32;//converting to upper case;
                new_word=new_word+(char)new_asci_code;
        }
        else if(convert>=65 && convert<=90){
             new_word=new_word+(char)convert;
        }
        else{
           new_word=new_word+(char)convert;
        }
    }
    System.out.print(new_word);
    
    }  
}
