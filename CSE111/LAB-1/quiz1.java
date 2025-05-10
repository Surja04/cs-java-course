public class quiz1 {
  public static void main(String[] args) {
    int[][] mat = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    int row = mat.length;
    int col = mat[0].length;
    int[][] myArr = new int[col][row];  // Rotated matrix should have swapped dimensions

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        myArr[j][row - 1 - i] = mat[i][j];
      }
    }

    // Print the rotated matrix
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print(myArr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
