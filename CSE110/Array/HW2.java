public class HW2 {
    public static void main(String[] args) {
        int arr1[] = {23, 100, 23, 56, 100};
        int arr2[] = new int[arr1.length];
        int currentIndex = 0;

        System.out.print("Given array:");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr1.length; i++) {
            int currentElement = arr1[i];
            boolean found = false;
            for (int j = 0; j < currentIndex; j++) {
                if (arr2[j] == currentElement) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr2[currentIndex] = currentElement;
                currentIndex++;
            }
        }
        System.out.println();

        System.out.print("New array:");
        for (int index = 0; index < currentIndex; index++) {
            System.out.print(arr2[index] + " ");
        }
    }
}
