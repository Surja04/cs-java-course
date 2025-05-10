public class Tracing{
    public static void main(String[]args){
        int a = 4, b = 7;
        System.out.println("Hello "+ methodA(a,b));
    }
    public static double methodA(int m,int n){
        int p = m+n-23, s=0;
        if(p<0){
            System.out.println(p);
            System.out.println(methodB(p+10));//7
            s = methodB(p-10);//-22,27
        }
        System.out.println(--s);
        return p*m+s;//-22
    }
    public static int methodB(int r){
        int q = 6;
        System.out.println(++r+q);
        return q-r;
    }
}