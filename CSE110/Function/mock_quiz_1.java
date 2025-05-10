public class mock_quiz_1 {
    public static void main(String[]args){
        int [ ] a = {4,5,6,7,11};
        int [ ] b = new int [ a.length-1];
        for(int i = 0; i < a.length-1; i++){
            b[i] = a [i]+a[i+1];
        }
        for(int j = 0; j < b.length; j++){
           System.out.print(b[j]+" ");
        }
    }
}