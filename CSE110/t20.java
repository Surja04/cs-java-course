public class t20
{
  public static void main(String[]args)
  {
   double a  = 4.5;  
   double b = 9.5;
   double c = Math.sqrt((a*a)+(b*b));
     double sinA = a/c;
     double sinB = b/c;
     double cosA = b/c;
     double cosB = a/c;
     System.out.println("sin(A) = "+sinA);
     System.out.println("sin(B) = "+sinB);
     System.out.println("cos(A) = "+cosA);
     System.out.println("cos(B) = "+cosB);
  }
}