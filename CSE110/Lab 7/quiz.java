public class quiz{
    public static void main(String[]args){
        int row=4;
        int col=2;
        int num=2;       
        for(int i=1; i<=row; i++){
            int j;
            for( j=col-1; j<=col; j++){
               
                System.out.print(num+" ");
                num=num+2;
            }                        
            System.out.println();
        }
    }
}