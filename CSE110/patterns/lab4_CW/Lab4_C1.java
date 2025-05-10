import java.util.Scanner;
public class Lab4_C1 {
  public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      int row=input.nextInt();
      int column=input.nextInt();
      for(int i=1; i<=row; i++){
        for(int j=1;j<=column; j++){
            System.out.println(j+ " ");
        }
        System.out.println();
      }
  }

}
