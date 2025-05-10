import java.util.Scanner;
public class Function_01{
    public static int addNumber(int num1,int num2){
        int sum = num1 + num2 ;
        return sum;
    }
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a Number:");
        int number_1 = input.nextInt();
        System.out.print("Enter a Number:");
        int number_2 = input.nextInt();
        int result = addNumber(number_1,number_2);
        System.out.print("The Sum is :");
        System.out.print(result);
    }
}