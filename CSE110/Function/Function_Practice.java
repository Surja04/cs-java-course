/*Write a function which will take 2 arguments. They are:
 Sentence
 position
 Your first task is to take these arguments as user input and pass 
 these values to the function parameters.
 Your second task is to implement the function and 
 remove the characters at the index number which is 
 divisible by the position (Avoid the index number 0 
 as it will always be divisible by the position, 
 so no need to remove the index 0 character). 
 Finally, add the removed characters at the end of the new string.
 Return the value and then finally, print the new string at the function call.
 Input: "I love programming."
 3
 Function call: function_name("I love programming.", 3)
 Output:
 I lveprgrmmngo oai.*/

import java.util.Scanner;
public class Function_Practice{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        String sentence = input.nextLine();
        int pos = input.nextInt();
        System.out.print(function_name(sentence,pos));
    }
    public static String function_name(String sen,int position){
        String first_str = ""+sen.charAt(0);
        String last_str = "";
        
        for(int i=1; i<sen.length(); i++){
            char ch = sen.charAt(i);
//            if(i==0){
//                 first_str = first_str + ch ;
//            }
             if( i%3!=0){
                first_str = first_str + ch ;
            }
            else {
                last_str = last_str + ch;
            }
        }
        String add = first_str + last_str;
        
        return add;
    }
}