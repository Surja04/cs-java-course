import java.util.Scanner;
public class A7_HW7{
  public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      String str1 = input.nextLine();
      String str2 = input.nextLine();
      int count = 0;
      for(int i = 0; i < str2.length()-1; i++){
         char ch1 = str2.charAt(i);
         
         for(int j=0; j < str1.length()-1; j++){
             char ch2 = str1.charAt(j);
             
             if(ch1 == ch2){
               if(str2.charAt(i+1) == str1.charAt(j+1)){
                   count++;
               }
             }
             else{
                continue;
             }
         }
      }
      System.out.print("Occurence: "+count+" times");
  }
}