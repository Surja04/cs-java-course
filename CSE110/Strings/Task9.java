import java.util.Scanner;
public class Task9 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String word=input.nextLine();
        char ch1 =  input.next().charAt(0);
        int length = word.length();
        int count=0;
        
        for(int i=0; i<=length-1; i++){
            char ch2=word.charAt(i);
            if(ch1==ch2){
                System.out.print(i);
                count++;
                break;
            }

        }
        if(count==0){
            System.out.print("Character not found");
        }
    }   
}
