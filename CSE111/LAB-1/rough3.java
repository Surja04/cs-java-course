import java.util.Scanner;

public class rough3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = {
            {0, 0, 10, 0, -1},
            {0, -1, 0, 0, -1},
            {-1, 0, -1, 0, 0},
            {0, -1, 7, 0, -1},
            {0, -1, 0, -1, 0}
        };

        System.out.println("Initial Map:");
        printMap(arr2D);

        int row = arr2D.length;
        int col = arr2D[0].length;
        int row_pos = -1, col_pos = -1;

        // Find the initial position of the player
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr2D[i][j] == 7) {
                    row_pos = i;
                    col_pos = j;
                    break;
                }
            }
        }

        int turns = 5;
        boolean foundTreasure = false;

        while (turns > 0) {
            int new_row = row_pos, new_col = col_pos;
            System.out.printf("Enter move %d (UP, DOWN, LEFT, RIGHT): ", (6 - turns));
            String inp = sc.nextLine().toUpperCase();

            // Update position based on input
            if (inp.equals("UP")) {
                new_row--;
            } else if (inp.equals("DOWN")) {
                new_row++;
            } else if (inp.equals("LEFT")) {
                new_col--;
            } else if (inp.equals("RIGHT")) {
                new_col++;
            } else {
                System.out.println("Invalid move. Try again.");
                continue;  // Retry the same turn
            }

            // Check boundaries
            if (new_row < 0 || new_row >= row || new_col < 0 || new_col >= col) {
                System.out.println("Player fell outside the playing area. Game over!");
                break;
            }

            // Check if player stepped on a mine or found the treasure
            if (arr2D[new_row][new_col] == -1) {
                System.out.println("Player stepped on a mine. Game over!");
                break;
            } else if (arr2D[new_row][new_col] == 10) {
                foundTreasure = true;
                System.out.println("Treasure found! You win!");
                arr2D[row_pos][col_pos] = 0;  // Clear previous position
                arr2D[new_row][new_col] = 7;  // Update to new position
                break;
            }

            // Update the player's position
            arr2D[row_pos][col_pos] = 0;  // Clear previous position
            row_pos = new_row;
            col_pos = new_col;
            arr2D[row_pos][col_pos] = 7;  // Update to new position

            // Print the current state of the map
            System.out.println("Current state:");
            printMap(arr2D);

            turns--;
        }

        if (!foundTreasure && turns == 0) {
            System.out.println("Failed to find the treasure.");
        }

        sc.close();
    }

    // Method to print the 2D grid
    public static void printMap(int[][] arr) {
        for (int[] row : arr) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
