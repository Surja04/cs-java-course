import java.util.Scanner;
public class Hw_4 {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);        
        int n=input.nextInt();
        for(int i=1; i<=n;i++){            
            for(int j=1; j<=i;j++){
                if(i==1 || i==2 || i==n || j==1 || j==i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }               
            }            
            
            System.out.println();
        }
    } 
}

