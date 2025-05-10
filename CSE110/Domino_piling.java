import java.util.Scanner;
public class Domino_piling {
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      int M = input.nextInt();
      int N = input.nextInt();
      int area_rec = M*N;
      int area_domino = 2;
      int number_of_domino = area_rec/area_domino;
      System.out.print(number_of_domino);
  }
  
}
