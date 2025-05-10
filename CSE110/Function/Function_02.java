import java.util.Scanner;
public class Function_02{
    public static int addNumber(int num1,int num2){
        int sum = num1 + num2 ;
        return sum;
    }
    public static int prodNumber(int num1,int num2){
        int prod = num1 * num2 ;
        return prod;
    }
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a Number:");
        int number_1 = input.nextInt();
        System.out.print("Enter a Number:");
        int number_2 = input.nextInt();
        int result_1 = addNumber(number_1,number_2);
        int result_2 = prodNumber(number_1,number_2);
        
        System.out.println("The Sum is :"+result_1);
        System.out.print("The Product is :"+result_2);

    }
}