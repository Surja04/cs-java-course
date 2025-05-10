import java.util.Scanner;
public class H4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String out="";
        int count=0;
        for(int i=0;i<=str.length()-1;i++) {
            int ch=str.charAt(i);
            if ((ch>=65&&ch<=90)||(ch>=97&&ch<=122)) {
                count++;
                if (count % 2 == 0) {
                    out += Character.toUpperCase(str.charAt(i));
                }
                if (count % 2 != 0){
                    out += Character.toLowerCase(str.charAt(i));
                }
            }
            else {
                out+=str.charAt(i);
            }
        }
        System.out.print(out);
    }
}