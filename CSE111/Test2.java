public class Test2
{
  public static void main (String [] args)
  {
    Circle r1 = new Circle();
    System.out.println("Radius of the circle is "+r1.radius);
    double area = r1.radius*r1.radius*Math.PI;
    double circum = 2*r1.radius*Math.PI;
    System.out.println("The area of the circle is "+area);
    System.out.println("The circumference of the circle is "+circum);
  }
}