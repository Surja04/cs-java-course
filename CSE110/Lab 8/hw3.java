import java.util.Scanner;
public class hw3 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the length of array 1: ");
        int length1 = scanner.nextInt();
        int[] arr1 = new int[length1];
        
        System.out.println("Please enter the elements of the arr1:");
        for (int i = 0; i < length1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Please enter the length of array 2: ");
        int length2 = scanner.nextInt();
        int[] arr2 = new int[length2];
        
        System.out.println("Please enter the elements of the arr2:");
        for (int i = 0; i < length2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        boolean isSubset = true;
        
        for (int i = 0; i < length2; i++) {
            boolean found = false;
            
            for (int j = 0; j < length1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                isSubset = false;
                break;
            }
        }
        
        if (isSubset) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }        
        scanner.close();
    }
} 