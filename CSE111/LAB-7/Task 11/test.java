public class test{
  public static void main(String[]args){
    int x[] = {23};
    A a1 = new A();
    B b1 = new B();
    B b2 = new B(b1);
    a1.methodA(1, x);
    System.out.println(" ddd :"+x[0]);
    b2.methodB(3, 2);
    System.out.println(" ddd :"+x[0]);
    a1.methodA(1, x);
    System.out.println(x[0]);
  }
}