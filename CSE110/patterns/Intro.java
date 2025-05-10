import java.util.Scanner;
public class  Intro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();        
        System.out.println(input1);
        int l =input1.length();
        System.out.println(l);
//        char s = input1.charAt(8);
//         System.out.println(s);
        for(int i=0; i<l; i++){
            System.out.print(i+" ");
            System.out.println(input1.charAt(i));
        }
    }
}

