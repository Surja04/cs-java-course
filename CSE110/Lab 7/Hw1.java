import java.util.Scanner;
public class Hw1 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String str1 = input.nextLine();
        int length = str1.length();
        String rev = "";
        String word = "";        
        for(int i=0; i<length; i++){
            char c = str1.charAt(i);                
            if(c!=' '){
                word+=c;
            }
            else{
                rev= word+ " "+rev;
                word="";
            }
       }
//        rev=word+" "+rev;
        System.out.println(rev);       
    }    
}
