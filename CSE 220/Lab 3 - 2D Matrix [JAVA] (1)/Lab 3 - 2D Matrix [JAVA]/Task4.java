// Task 04: Matrix Compression
class Task4{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){
        int row = matrix.length;
        int col = matrix[0].length;
        Integer[][] result = new Integer[row/2][col/2];
        int sum = 0;
        for(int i = 0; i < row; i++ ) {
            if (i % 2 == 0)
                {
                    for (int j = 0; j < col; j++) {
                        if (j % 2 == 0)
                        {
                            sum = matrix[i][j] + matrix[i + 1][j] + matrix[i][j + 1] + matrix[i + 1] [j + 1];

                            result[i/2][j/2] = sum;
                        }
                    }

                }



        }

        return result;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}