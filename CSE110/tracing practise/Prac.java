import java.util.Scanner;
public class Prac {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int y=0;
    int sum=0;
    for(int i=1;i<=n;i++){
        
        sum=i*i;
        y=y+i;
        
        
    }
    System.out.print(y);
    }
    
}
