public class Bubble_Sorting {
    public static void main(String[] args) {
        int array[] = { 10, 5, 20, 1 };
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int index=0; index<=length-1;index++){
            System.out.print(array[index]+" ");
        }
    }
}
