public class Shape2D
{
  public int sq_l;
  
  public int rec_l;
  public int rec_b;
  
  public int tri1_b;
  public int tri1_h;
  public String tri1_name;
  
  public int tri2_a;
  public int tri2_b;
  public int tri2_c;
  
  public String shape;
  
  public Shape2D()
  {
    sq_l = 5;
    System.out.println("A Square has been created with length: "+sq_l);
    shape = "Square";
  }  
  public Shape2D(int rec_l,int rec_b)
  {
    this.rec_l=rec_l;
    this.rec_b=rec_b;
    System.out.println("A Rectangle has been created with "+"length: "+rec_l+" and "+"breadth: "+rec_b);
    shape = "Rectangle";
  }  
  public Shape2D(int tri1_b,int tri1_h,String tri1_name)
  {
    this.tri1_b = tri1_b;
    this.tri1_h = tri1_h;
    this.tri1_name = tri1_name;
    System.out.println("A "+tri1_name+" has been created with "+" height: "+tri1_b+" base: "+tri1_h);
    shape = "Triangle";
  }  
  public Shape2D(int tri2_a,int tri2_b,int tri2_c)
  {
    this.tri2_a=tri2_a;
    this.tri2_b=tri2_b;
    this.tri2_c=tri2_c;
    System.out.println("A Triangle has been created with the following sides: "+tri2_a+","+tri2_b+","+tri2_c);
    shape = "TriangleSides";
  }
  public void area()
  {
    if(shape.equals("Square"))
    {
      double ar1 = (double)sq_l*sq_l;
      System.out.println("The area of the Square is: "+ar1);
     
    }
    else if(shape.equals("Rectangle"))
    { 
      double ar2 = (double)rec_l*rec_b;
      System.out.println("The area of the Rectangle is: "+ar2);
      
    }
    else if(shape.equals("Triangle"))
    {
      double ar3 = 0.5*(double)tri1_b*tri1_h;
      System.out.println("The area of the "+ tri1_name +" is: "+ar3);
      
    }
    else if(shape.equals("TriangleSides"))
    {
      double s = (double)(tri2_a+tri2_b+tri2_c)/2;
      double ar4 =(double) Math.sqrt(s*(s-tri2_a)*(s-tri2_b)*(s-tri2_c)); 
      System.out.printf("The area of the Triangle is: %.2f  ",ar4);
      System.out.println();
    }
  }
  
  
}