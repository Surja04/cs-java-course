import java.util.Scanner;
public class Lab4_cw3 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        while(true){
            System.out.print("Enter Number:");
            int num=input.nextInt();
            if(num>0){
              System.out.println((int)Math.pow(num,2));  
            }
            else{
                break;
            }
        }
    }  
}
