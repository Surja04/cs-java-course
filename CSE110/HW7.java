import java.util.Scanner;
public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str1 = ");
        String str1 = sc.nextLine();
        System.out.print("str2 = ");
        String str2 = sc.nextLine();
        int occ=0;
        for(int i=0;i<=str1.length()-str2.length();i++){
            String temp="";
            for(int j=i;j<i+str2.length();j++){
                temp+=str1.charAt(j);
            }
            if(temp.equals(str2)){
                occ++;
            }
        }
        System.out.println( "Occurrence:"+occ);
    }
}