public class student {
  public String name;
  public int id;
  public String department;
  public String email=null;
  public String password=null;
  public boolean loginStatus=false;
  public String[] courses;
  
  public void Student(String name, int id, String department) {
    this.name = name;
    this.id = id;
    this.department = department;

    this.courses = new String[5];
    System.out.println("Student object is created");
  }
}

