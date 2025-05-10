import java.util.Scanner;
public class Lab4_hw5 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int temp=num;
        int count=0;
//        double digit;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        
        double power=Math.pow(10,(count-1));
        int power1=(int)power;
//        System.out.print(power1);
        
        while(num!=0){
            int digit=num/power1;
            if(power1==1){
            System.out.print(digit);
            }
            else{
                System.out.print(digit+",");
            }
             num=num%power1;
             power1=power1/10;
          
        }
            
        
    }
}
