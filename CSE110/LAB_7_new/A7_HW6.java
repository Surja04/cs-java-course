import java.util.Scanner;
public class A7_HW6 {
  public static void main (String[]args){
    Scanner input = new Scanner (System.in);
    String word = input.nextLine();
    boolean isUpperCase=false;
    boolean isLowerCase=false;
    boolean isSpecial=false;
    boolean isDigits=false;
    boolean isSpace =false;
    if(word.length()<8){
        System.out.print("False");
        return;
    }
    for(int i = 0; i < word.length(); i++){
        char ch = word.charAt(i);
        
        if(ch >= 'A' && ch <= 'Z'){
           isUpperCase = true;
        }
        else if(ch >= 'a' && ch <= 'z'){
           isLowerCase = true;
        }
        else if(ch>='0' && ch <='9'){
          isDigits = true;
          
        }
        else if(ch == ' '){
           isSpace = true;
            
            
        }
        else  {//!isUpperCase && !isLowerCase && !isDigits && ch!=' '
           isSpecial = true;
        }

    }
    
    if(isUpperCase && isLowerCase && isSpecial && isDigits && !isSpace){
        System.out.print("True");
    }
    else{
        System.out.print("False");
    }
    
  }
  
}
