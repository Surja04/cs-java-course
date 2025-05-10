import java.util.Scanner; 

public class hw4 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Please enter the length of array: ");
    int length = scanner.nextInt();
    
    int[] array = new int[length];
    
    System.out.println("Please enter the elements of the array:");
    for (int i = 0; i < length; i++) {
      array[i] = scanner.nextInt();
    }
    
    System.out.print("Please enter the target value: ");
    int targetValue = scanner.nextInt();
    
    boolean pairFound = false;
    
    for (int i = 0; i < length - 1; i++) {
      for (int j = i + 1; j < length; j++) {
        if (array[i] + array[j] == targetValue) {
          System.out.println("Elements need to be added: " + array[i] + " " + array[j]);
          System.out.println("Index of the elements: " + i + " and " + j);
          pairFound = true;
          break;
        }
      }
      if (pairFound) {
        break;
      }
    }
    
    if (!pairFound) {
      System.out.println("Target value not found");
    }
    
    scanner.close();
  }
} 



