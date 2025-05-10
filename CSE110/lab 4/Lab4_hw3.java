import java.util.Scanner;
public class Lab4_hw3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(int i=1; i<=num; i++){
            if(i%5==0 && i%3!=0){
                System.out.println(i);
            }
        }
    }

}
