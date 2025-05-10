public class Student
{
  
  public String fullName;
  public int studentId;
  public String dept;
  public String email;
  public String password;
  public boolean isLoggedIn;
  public String[] enrolledCourses;
  public int course_count = 0;
  public int max_count = 3;//from 0 to 2
  
  public Student(String fullName, int studentId, String dept) {
    this.fullName = fullName;
    this.studentId = studentId;
    this.dept = dept;
    this.email = null;
    this.password = null;
    this.isLoggedIn = false;
    this.enrolledCourses = new String[5];
    System.out.println("Student object is created");
    
  }
}