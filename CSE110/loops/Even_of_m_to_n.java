import java.util.Scanner;
public class Even_of_m_to_n {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        if(m%2==0){
            for(int j=m; j<=n; j+=2){
                System.out.println(j);
                
            }          
        }
        else{
            System.out.print("The input is an odd number");
        }
        
    }  
    
}
