import java.util.Scanner;
public class BeautifulMatrix{
  public static void main (String[] args){
      Scanner input = new Scanner (System.in);
      int count1 = 0;
      int count2 = 0;
      int arr[][] = new int [5][5];
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
            arr[i][j] = input.nextInt();
            if(arr[i][j]==1){
              count1 = i;
              count2 = j;
            }
        }
      }

      int z1 = count1-2;
      int z2 = count2-2;
      if(z1<0){
          z1=-z1;
      }
      if(z2<0){
          z2 = -z2;
      }
      System.out.print(z1+z2);
      
  }
}