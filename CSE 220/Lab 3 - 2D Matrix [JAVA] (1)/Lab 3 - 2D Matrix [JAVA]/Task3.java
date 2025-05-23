// Task 03: Row Rotation Policy of BRACU Classroom
class Task3{

    //Complete this method so that it gives the Expected Output
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){
       int count  = 1;
       int row = matrix.length;
       int col = matrix[0].length;
       String arr [] = new String [col];
       while(count< examWeek)
       {
            for(int k =0; k < col; k++)
            {
                arr[k ] = matrix[row-1][k];
            }
            for(int i = row-1; i>0 ; i--)
            {
                for(int j =0; j<col; j++)
                {
                    matrix[i][j] = matrix[i-1][j];
                }
            }
            for(int i =0; i<col; i++)
            {
                matrix[0][i] = arr[i];
            }
            count++;
       }
       int n = 0;
       for(int i = 0; i< row; i++)
       {
           for(int j =0; j<col; j++)
           {
               if(matrix[i][j]=="AA")
               {
                   n = i+1;
               }
           }
       }
       return n;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}