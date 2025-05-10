import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        int i = 1;
        while (i<11)
        {
          System.out.println(i);
          i++;
        }
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        int n = i;
        if(n==11)
        {
            return;
        }
        System.out.println(i);
        n++;
        task1B_recursive(n);

    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        int i = 1;
        while(i <= n)
        {
            System.out.println(i);
            i++;
        }
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        i++;
        task1D_recursive(i, n);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Task1A() started ");
        task1A();
        System.out.println(" Task1A() finished ");
        System.out.println(" task1B_recursive() started ");
        int n = 1;
        task1B_recursive(n);
        System.out.println(" task1B_recursive() finished ");
        System.out.println();
        System.out.println(" task1C() started ");
        int i = sc.nextInt();
        task1C(i);
        System.out.println(" task1C() finished ");
        System.out.println();
        System.out.println(" task1D_recursive() started ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        task1D_recursive(i1, i2);


        sc.close();
    }
}
