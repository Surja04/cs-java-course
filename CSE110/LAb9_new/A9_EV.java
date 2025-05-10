public class A9_EV
{
    public static void main(String [] args)
    {
     boolean res = isTriangle(7,5,10);
     System.out.println(res);
     triArea(7,5,10);
    }
    public static boolean isTriangle(int a,int b,int c)
    {
        boolean is_triangle = false;
        if(a+b > c && a+c > b && b+c > a){
           is_triangle = true;
        }

        return is_triangle;
    }
    public static void triArea(int a, int b, int c)
    {
      if(isTriangle(a,b,c))
      {
        double s = (a+b+c)/2;
        double aot = Math.sqrt(s*(s-a)*(s-b)*(s-c));//aot=area of triangle
        System.out.println(aot);
      }
      else
      {
        System.out.print("Can't Form Triangle");
      }
    }
}