//Task 10
import java.util.Scanner;
public class A1_T10
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner (System.in);
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
    int col = arr2D.length;
    int row_pos = -1, col_pos = -1;
    for(int i = 0; i < row; i++)
    {
      for(int j = 0; j < col; j++ )
      {
        if(arr2D[i][j] == 7)
        {
          row_pos = i;
          col_pos = j;
          break;
        }
      }
    }
    int turns = 5;
    boolean foundTreasure = false;
    while (turns > 0)
    {
      int new_row = row_pos;
      int new_col = col_pos;
      System.out.printf("Enter move %d:",(6-turns));
      String s1 = input.nextLine();
      
      if(s1.equals("UP"))
      {
        new_row--;
      }
      else if(s1.equals("DOWN"))
      {
        new_row++;
      }
      else if(s1.equals("LEFT"))
      {
        new_col--;
      }
      else if(s1.equals("RIGHT"))
      {
        new_col++;
      }
      else
      {
        break;
      }
      if (new_row < 0 || new_row >= row || new_col < 0 || new_col >= col) 
      {
        System.out.println("Player fell outside the playing area. Game over!");
        break;
      }
       if (arr2D[new_row][new_col] == -1)
      {
        System.out.println("Player stepped on a mine. Game over!");
        break;
      }
      else if (arr2D[new_row][new_col] == 10) {
        foundTreasure = true;
        System.out.println("Treasure found.You win!");
        arr2D[row_pos][col_pos] = 0;  
        arr2D[new_row][new_col] = 7;  
        break;
      }
      arr2D[row_pos][col_pos] = 0;
      row_pos = new_row;
      col_pos = new_col;
      arr2D[row_pos][col_pos] = 7;
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
      
    }
   
    if(!foundTreasure && turns == 0)
    {
      System.out.println("Failed to find the treasure.");
    }
  }
  public static void printMap(int [] [] arr)
  {
    int row_1 = arr.length;
    int col_1 = arr[0].length;
    for(int i = 0; i < row_1; i++ )
    {
      for(int j = 0; j < col_1; j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}