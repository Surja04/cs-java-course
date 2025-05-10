public class Triangle
{
  public int a,b,c;
  public int perimeter;
  public void updateSides(int a, int b, int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public void triangleDetails()
  {
    perimeter=a+b+c;
    System.out.println("Three sides of the triangle are: "+a+","+b+","+c);
    System.out.println("Perimeter: "+perimeter);
  }
  public String printTriangleType()
  {
    if(a==b && b==c && c==a)
    {
      return "This is an Equilateral Triangle.";
    }
    else if(a == b || b == c || c == a)
    {
      return "This is a Isosceles Triangle.";
    }
    else
    {
      return "This is a Scalene Triangle.";
    }    
  }
  public void compareTrinagles(Triangle t)
  {
    if(this != t && this.a == t.a && this.b == t.b && this.c == t.c )
    {
      System.out.println("Addresses are different but the sides of the triangles are equal.");
    }
    else if(this == t)
    {
      System.out.println("These two triangle objects have the same address.");
    }    
    else if(this.perimeter == t.perimeter)
    {
      System.out.println("Only the perimeter of both triangles is equal.");
    }

    else
    {
      System.out.println("Addresses, length of the sides and perimeter all are different.");
    }
  }
}