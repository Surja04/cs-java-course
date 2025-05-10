import java.util.Scanner;
public class Quiz3 {
    public static void main(String[]args){
    Scanner input=new Scanner (System.in);
    System.out.print("Enter Budget:");
    int budget=input.nextInt();
    int count=0;
    int cost=0;
    while(budget!=0){
         System.out.print(" Item price:");
        int price=input.nextInt();
      
        if(price<=budget){
           
            count++;
             cost=cost+price;
             budget=budget-price;
        }
        else{
            break;
        }     
    }

    System.out.println("Total Cost:"+cost);
    System.out.println("Total items bought:"+count);
    }
 
}
