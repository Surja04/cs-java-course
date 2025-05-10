import java.util.Scanner;
public class Lab3_A8_final {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int num1 = input.nextInt();
        System.out.println("Input the 2nd number:");
        int num2 = input.nextInt();
        System.out.println("Input the 3rd number:");
        int num3 = input.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.print("All numbers are equal");
        } 
        else if (num1 != num2 && num1 != num3 && num2!=num3) {
            System.out.print("All numbers are different");
        } 
        else {
            System.out.print("Neither all are equal or different");
        }
    }
}