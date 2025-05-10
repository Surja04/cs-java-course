import java.util.Scanner;
public class EV2 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("N:");
        int N = input.nextInt();
        int array [] = new int[N];
        boolean found=false;
        
        for(int i=0; i<N; i++){
            System.out.print("Enter a number:");
            array[i]= input.nextInt();                
            
        } 
        int user_input = input.nextInt();
        int index=-1;
        for(int i=0; i<N; i++){
            if(array[i]==user_input){
                found = true;
                index=i;
                break;
            }           
        }
        if(found){
        System.out.print(user_input + "is at" + "index" + index );    
        }
        else if(!found){
           System.out.print("Elements not found" ); 
        }
    }     
}
