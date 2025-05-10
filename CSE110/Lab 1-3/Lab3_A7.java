import java.util.Scanner;
public class Lab3_A7 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
       System.out.println("Enter the amount the customer need to pay(Taka)");
       int total_payment=input.nextInt();

       System.out.println("Enter the amount, customer gave(Taka)");
       int customer_payment=input.nextInt();
       
       if(customer_payment>total_payment){
           int return_amount = customer_payment - total_payment;
           System.out.println("The returned amount is "+ return_amount + " taka. ");
               
           int hundred_taka_note = return_amount / 100;
           System.out.println("100 taka note:" + hundred_taka_note);           
           return_amount = return_amount - 100 * hundred_taka_note;
           
           
           int fifty_taka_note = return_amount / 50;
           System.out.println("50 taka note:" + fifty_taka_note);           
           return_amount = return_amount - 50 * fifty_taka_note;
           
           int twenty_taka_note = return_amount / 20;
           System.out.println("20 taka note:" + twenty_taka_note);           
           return_amount = return_amount - 20 * twenty_taka_note;
           
           
           int ten_taka_note = return_amount / 10;
           System.out.println("10 taka note:" + ten_taka_note);           
           return_amount = return_amount - 10 * ten_taka_note;
           
           
           int five_taka_note = return_amount / 5;
           System.out.println("5 taka note:" + five_taka_note);           
           return_amount = return_amount - 5 * five_taka_note;
           
           
           int two_taka_note = return_amount / 2;
           System.out.println("2 taka note:" + two_taka_note);           
           return_amount = return_amount - 2 * two_taka_note;
           
           
           int one_taka_note = return_amount / 1;
           System.out.println("1 taka note:" + one_taka_note);           
           return_amount = return_amount - 1 * one_taka_note;           
       }
       else if(customer_payment==total_payment){
           System.out.print("The returned amount is 0 taka");
       }
       else if(customer_payment<total_payment){
           int need_to_pay=total_payment-customer_payment;
           System.out.print("Please pay " +need_to_pay+  " taka more.") ; 
       }
        
    }
}
