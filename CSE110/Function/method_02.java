public class method_02{
    public static void main(String[]args){
        int arr1 [] = {1,2,3,4,5,6,7,8,9,10};
        my_method (arr1);
    }
    public static void my_method(int []a1){
//        System.out.print(n1+ " " + n2 + " "+"my method is working");
        for(int i=0; i<a1.length; i++){
            if(a1[i]%2==0){
                System.out.print(a1[i]+" ");
            }
        }
    }
}