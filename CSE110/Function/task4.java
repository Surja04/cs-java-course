import java.util.Scanner;
public class task4{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int num_of_days = input.nextInt();
        year_month_day_finder(num_of_days);
    }
    public static void year_month_day_finder(int n1){
        int year = n1/365;
        int month = (n1 - (year*365))/30;
        int days = n1-(year*365)-(month*30);
        
        System.out.print( year+" years ");
        System.out.print(month+" months ");       
        System.out.print(days+" days");
    }
}