import java.util.Scanner;
public class Lab4_ev2 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System.out.print("Enter an integer:");
        int num2=input.nextInt();
        int count_pos=0;
        int count_neg=0;
        for(int i=1; i<=num2;i++){
            System.out.print("Enter number "+i);
            int num=input.nextInt();
            if(num>0){
                count_pos++;
           }
            else{
                count_neg++;
           }
            
        }
        System.out.println(count_pos+"Non-negative Numbers");
        System.out.println(count_neg+"Negative Numbers");
    }
    
}
