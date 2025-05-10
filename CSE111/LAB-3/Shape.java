public class Shape
{
    public String name;
    public double area;
    
    public void setParameters(String n1, int a1)
    {
      name = n1;
      area = 3.1416*a1*a1;
//      return "Shape Name: "+name+"\n"+"Area:%.2f "+area;
    }
    public void setParameters(String n1, int b, int h)
    {
      name = n1;
      area = 0.5*b*h;
//      return "Shape Name: "+name+"\n"+"Area:%.2f "+area;
    }
    public void setParameters(String n1, double l, double w)
    {
      name = n1;
      area = l*w;
//      return "Shape Name: "+name+"\n"+"Area:%.2f "+area;
    }
    //details
        public String details()
    {

      return "Shape Name: "+name+"\n"+"Area: "+area;
    }

    
}