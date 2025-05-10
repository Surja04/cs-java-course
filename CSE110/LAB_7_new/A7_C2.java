import java.util.Scanner;
public class A7_C2{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    String word = input.nextLine();
    String new_word = "";
    int leng = word.length();
    
    for(int i =leng-1 ; i>=0; i-- ){
      char ch = word.charAt(i);
      new_word = new_word + ch;
    }
    if(word.equals(new_word)){
      System.out.print("True");
    }
    else{
      System.out.print("False");
    }
  }
}