public  class Student_Method_Test
{
  public static void main(String[]args)
  {
    Student_Method s1 = new Student_Method();
    Student_Method s2 = new Student_Method();
    s1.name = "bob";
    s1.id = "123";
    
    s1.showDetail(7);
    s2.showDetail(6);
  }
}