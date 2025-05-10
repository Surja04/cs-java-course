// Task 05: Game Arena
class Task5{

    //Complete this method so that it gives the Expected Output
    public static String playGame(Integer[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] % 50 == 0 && matrix[i][j] != 0) {  // Check if it's a player
                    // Check above
                    //left
                   if(j > 0 && matrix[i][j-1] == 2)
                   {
                       sum += 2;
                   }
                   //right
                   if(j < col-1 && matrix[i][j+1] == 2)
                    {
                        sum += 2;
                    }
                   //up
                   if(i>0 && matrix[i-1][j] == 2)
                   {
                       sum += 2;
                   }
                   //down
                    if(i < row-1 && matrix[i+1][j] == 2)
                    {
                        sum += 2;
                    }
                }
            }
        }
         String s =  "";
        if (sum >= 10) {
            s = "Points Gained: " + sum + ". Your team has survived the game.";
        }
        else {
            s = "Points Gained: " + sum + ". Your team is out.";
        }
        return s;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}