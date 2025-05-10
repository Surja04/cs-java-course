//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        int row = matrix.length, col = matrix[0].length;
        int arr[] = new  int[col];
        for(int i = 0; i<col; i++)
        {
            for(int j =0; j < row;j++)
            {
                arr[i] = arr[i]+matrix[j][i];
            }
        }
        for(int i = 0; i<col-1; i++)
        {
          arr[i] = arr[i+1]-arr[i];

        }
        Integer result[] = new Integer[col-1];
        for(int i=0; i<col-1; i++)
        {
            result[i] = arr[i];
        }
     return result;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}