import java.util.Scanner;
class UserInput{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter an integer number");
    int number = sc.nextInt();
    System.out.print("Please enter a float number");
    float float_num = sc.nextFloat();
    System.out.print("Please enter a string");
    String str_value = sc.next();
    System.out.println("Integer: " + number);
    System.out.println("Float: " + float_num);
    System.out.println("String: " + str_value);
  }
}