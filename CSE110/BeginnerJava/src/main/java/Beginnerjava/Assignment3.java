
 
package Beginnerjava;
import java.util.Scanner;


public class Assignment3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
    
        
        System.out.print("Id:");
        int id;
        String temp;
        id=input.nextInt();
        temp=input.nextLine();//for consuming the enter key.
      // System.out.print("Id:");
        //String id=input.nextLine();
        
       
        
       System.out.print("Title:");
       String Title=input.nextLine();
        
       
        System.out.print("Price:");
        String price=input.nextLine();
        
        System.out.print("Description:");
        String description=input.nextLine();
        
        System.out.print("Category:");
        String category=input.nextLine();
        
        System.out.println("Id:"+id);
        System.out.println("Title:"+Title);
        System.out.println("price"+price);
        System.out.println("description:"+description);
        System.out.println("category:"+category);
      
        
        
             
                
              

        

        
        
        

        
        
        
        
        
        
        
        
    }
        
    
}
