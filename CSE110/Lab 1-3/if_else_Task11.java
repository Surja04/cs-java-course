import java.util.Scanner;
public class if_else_Task11{
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int hour=input.nextInt();
    
      if(hour>=0 && hour<=23){
          if(hour>=4 && hour<=6){
              System.out.print("Breakfast");
              
          
          }
          else if(hour>=12 && hour<=13){
              System.out.print("Lunch");
          
          
          }
          else if(hour>=16 && hour<=17){
          
              System.out.print("Snacks");
              
          }
          else if(hour>=19 && hour<=20){
          
              System.out.print("Dinner");
              
          }
           else {
          
              System.out.print("Patience is virtue");
              
          }
           
          
              
    
    
       }
      
      else{ 
          System.out.print("Wrong time");
      }
    
    }
    
    
    
}