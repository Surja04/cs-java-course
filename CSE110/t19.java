public class t19
{
  public static void main(String[]args)
  {
    int a = 8;
    int b = 3;
    int c = a/2;
    double d = Math.sqrt((c*c)-(b*b));
    System.out.println("length = "+d);
    double area = (3*Math.sqrt(3))*(d*d)/2; 
    System.out.println("Area = "+area);
    double circum = 6*d;
    System.out.print("circumference = "+circum);
  }
}