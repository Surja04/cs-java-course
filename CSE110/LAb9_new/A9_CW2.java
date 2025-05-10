import java.util.*;
public class A9_CW2
{
  public static void main(String [] args)
  {
    //Part A;
     double result = circleArea(5);
     System.out.printf("%.4f",result);
     System.out.println();
    //Part B;
      double volume = sphereVolume(5);
      System.out.printf("%.4f",volume);
      System.out.println();
     //Part C;
      findSpace(5,"sphere");

  }
  public static double circleArea(int a)
  {
      double area = Math.PI*a*a;
      return area;
  }
  public static double sphereVolume (int a)
  {
      double volume = (4.0/3.0)*Math.PI*Math.pow(a,3);
      return volume;
  }
  public static void findSpace(int a, String str1)
  {
    if(str1.equals("circle"))
    {
      System.out.printf("%.4f",circleArea(a));
      System.out.println();
    }
    else if(str1.equals("sphere"))
    {
      System.out.printf("%.4f",sphereVolume(a));
      System.out.println();
    }
    else
    {
      System.out.println("wrong parameter");
    }
  }
  
 
  
}