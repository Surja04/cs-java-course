import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        String s = sc.next();

        char pre = s.charAt(0);
        String com = "" ;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == pre) {
                count++;
            } 
            else {
                com += pre + "" + count + "";
                pre = cur ;
                count = 1;
                
            }
        }

        com += pre+""+ count+"";

        System.out.println(com);
      
    }
}
