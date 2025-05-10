import java.util.Scanner;

public class A8_EV2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int N=sc.nextInt();
        int[]  arr=new int[N];
        for(int i=0;i<N;i++){
          System.out.println("Enter a number:");
          arr[i]=sc.nextInt();
        }
        int srnum=sc.nextInt();
        boolean f=false;
        int index=-1;
        for(int i=0;i<N;i++){
          if(arr[i]==srnum){
            f=true;
            index=i;
            break;
          }
        }
        if(f){
          System.out.println(srnum+" is at index "+index);
        }
        else{
          System.out.println("Element not found");
          }
        }
    }
