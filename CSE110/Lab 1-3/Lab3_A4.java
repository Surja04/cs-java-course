import java.util.Scanner;
public class Lab3_A4 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int studentid=input.nextInt();
       int year=studentid/1000000;
       int session=(studentid/100000)%10;
//       System.out.println(year);
//       System.out.print(session);
       if(session==1){
           System.out.print("Student Joined BRAC in Spring "+year);
       }
       else if(session==2){
           System.out.print("Student Joined BRAC in Fall "+year);
       }
       else if(session==3){
           System.out.print("Student Joined BRAC in Summer "+year);
       }
    
    }
   
}
