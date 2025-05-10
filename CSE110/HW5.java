import java.util.*;
public class HW5{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Given String1: ");
        String name = sc.nextLine();
        System.out.print("Given String2: ");
        String last = sc.next();
        String main="";
        for(int i=0;i<name.length();i++){
            boolean bool =true;
            char ch = name.charAt(i); 
            String l1 = name.toLowerCase();
            String l2 = last.toLowerCase();
            for(int j=0;j<last.length();j++){
                char ch2= l1.charAt(i);
                char ch1 = l2.charAt(j);
                if(ch1==ch2){
                    bool=false;
                    break;
                }
            }
            if(bool){
                main+=ch;
            }
        }
        System.out.println(main);
    }
}