public class hw2 {
    public static void main(String[] args) {
        int[] array1 = { 23, 100, 23, 56, 100, 2, 3, 23, 8, 10 };
        
        System.out.println("Input array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        
        int[] array2 = new int[array1.length];
        int count = 0;
        
        for (int i = 0; i < array1.length; i++) { // 0<5, 1<5, 2<5, 3<5, 4<5
            int currentElement = array1[i]; // ce=23, ce=100, ce=23, ce=56, ce=100
            int j;
            boolean repeat = false;
            for (j = 0; j < count; j++) { // 0<1, 1!<1, 0<2, 0<2, 0<3
                if (array2[j] == currentElement) { // 23 != 100, 23=23, 23!=56, 100!=56, 23!=56
                    repeat = true;
                    break;
                }
            }
            
            if (!repeat) { // 0=0, 1=1, 2=2, 
                array2[count] = currentElement; // array2[0]=23, array[1]=100, array[2]=56
                count++; // 1, 2, 3
            }
        }
        
        System.out.println("New array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array2[i] + " ");
        } 
        
    }
} 