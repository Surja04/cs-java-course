public class Teacher
{
  String name;
  String initial;
  public Course course_list [] = new Course [7];
  public int course_count = 0;
  public Teacher(String name, String initial)
  {
    this.name = name;
    this.initial = initial;
    System.out.println("A new teacher has been created");
  }
  public void addCourse(Course c)
  {
    course_list[course_count] = c;
    course_count++;
  }
  public void printDetail()
  {
    System.out.println("Name: "+name);
    System.out.println("Initial: "+initial);
    System.out.println("List of courses:");
    
    for(int i = 0; i < course_count; i++)
    {
      System.out.println(course_list[i].course);
    }
  }  

}