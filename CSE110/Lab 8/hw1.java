import java.util.Scanner; 

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        
        double[] arr = new double[len];
        
        for (int i = 0; i < len; i++) {
            System.out.print("enter a number: ");
            arr[i] = sc.nextDouble();
        }
        
        double maxNum = arr[0];
        double minNum = arr[0];
        double sum = 0;
        int max = 0;
        int min = 0;
        
        for (int i = 0; i < len; i++) {
            sum = sum + arr[i];
            
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                max = i;
            }
            
            if (arr[i] < minNum) {
                minNum = arr[i];
                min = i;
            }
        }
        
        double avg = sum / len;
        
        System.out.println("Maximum element " + maxNum + " at index " + max);
        System.out.println("Minimum element " + minNum + " at index " + min);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + avg);
        
        sc.close();
    }
}