public class Student
{
  public static int total_students = 0;
  public static int cse_students = 0;
  public static int other_students = 0;
  public String name;
  public int id;
  public double cgpa;
  public String dept;
  
  public static void printDetails()
  {
    System.out.println("Total Student(s): "+total_students);
    System.out.println("CSE Student(s): "+cse_students);
    System.out.println("Other Department Student(s): "+other_students);
  }
  
  public Student(String nm, double cg)
  {
    name = nm;
    cgpa = cg;
    dept = "CSE";
    total_students++;
    cse_students++;
    id = total_students;
  }
  public void individualDetail()
  {
      System.out.println("ID: "+id);
      System.out.println("Name: "+name);
      System.out.println("CGPA: "+cgpa); 
      System.out.println("Department: "+dept);
  }   
  public Student(String nm, double cg,String dep)
  {
    name = nm;
    cgpa = cg;
    dept = dep;
    total_students++;
    other_students++;
    id = total_students;
  }
}