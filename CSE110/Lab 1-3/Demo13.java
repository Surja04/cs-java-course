import java.util.Scanner;
public class Demo13 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int num1=input.nextInt();
        System.out.println("Input the 2nd number:");
        int num2=input.nextInt();
        System.out.println("Input the 3rd number:");
        int num3=input.nextInt();
        
        if(num1==num2 && num1==num3){
            System.out.print("All numbers are equal");
        }
        else if(num1>num2 && num1>num3){
            if(num2!=num3 ){
            System.out.print("All numbers are different");
            

            }
                           else{
                System.out.print("Neither all are equal or Different");
                }
        
        }
        else if(num2>num1 && num2>num3){
            if(num1!=num3){
            System.out.print("All numbers are different");

            }
                        else{
              System.out.print("Neither all are equal or Different");  
            }
        }
            
            else if(num3>num1 && num3>num2){
                if(num2!=num1 ){
            System.out.print("All numbers are different");

                }
               else{
               System.out.print("Neither all are equal or Different");      
            }
        }
//            else if(num1==num2){
//                if(num2>num3 || num2<num3){
//                System.out.print("Neither all are equal or different");
//                }
//            }
//            else if(num1==num3){
//                if(num2>num3 || num2<num3){
//                System.out.print("Neither all are equal or different");
//                }
//            }
//             else if(num2==num3){
//                if(num1>num3 || num1<num3){
//                System.out.print("Neither all are equal or different");
//                }
//            }
    }
    
    
}
