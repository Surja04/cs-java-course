import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {        
        String s = "Abraca dabra";
        String ans_str = "" + s.charAt(0);
        for(int i=1; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            boolean repeat = false;
            for(int j=0; j<ans_str.length(); j++)
            {                
                if(s.charAt(i) == ans_str.charAt(j))
                {
                    repeat = true;
                    break;
                }
            }
            if(repeat == false)
            {
                ans_str += ch;
            }
        }
        System.out.println(ans_str);
    }
}   

