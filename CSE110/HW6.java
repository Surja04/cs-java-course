import java.util.*;
public class HW6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String last = sc.next();
        int a = last.length();
        boolean len=false;
        boolean up =false;
        boolean low= false;
        boolean cha =false;
        boolean digit=false;
        if(a>=8){
            len=true;
        }
        for(int i=0;i<a;i++){
            int ch = last.charAt(i); 
            if(ch>=65 && ch<=90){
                up =true;
            }
            if(ch>=97 && ch<=122){
                low=true;
            }
            if(ch>=48 &&ch<=57){
                digit=true;
            }
            if(ch>=33 && ch<=126){
                if(!((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 &&ch<=57))){
                    cha =true;
                }
            }

        }
        boolean main = cha && len && up && low && digit;
        System.out.println(main);
    }
}