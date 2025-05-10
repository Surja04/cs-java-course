//import java.util.*;
public class Circle
{
  public static int count = 0;
  private double radius ;
  public double area;
  public Circle(int rad)
  {
    radius = (double) rad;
    count++;
  }
  public double getRadius()
  {
    return radius;
  }
  public double area()
  {
    area = Math.PI*radius*radius;
    return area;
  }
}