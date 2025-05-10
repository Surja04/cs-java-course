public class Usis {
  
  
  int totalAdvisee;
  Student[] advisees;
  
  public Usis() {
    this.totalAdvisee = 0;
    this.advisees = new Student[5];
    System.out.println("Usis is ready to use!");
  }
  
  public void login(Student student) {
    if (student.email == null || student.password == null) {
      System.out.println("Email and password need to be set.");
    }
    else {
      student.loginStatus = true;
      System.out.println("Login successful");
    }
  }
  
  public void advising(Student student) {
    if (!student.loginStatus) {
      System.out.println("Please login to advise courses!");
    }
    else if (student.courses[0] == null) {
      System.out.println("You haven't selected any courses.");
    }
    else {
      updateAdvisee(student);
    }
  }
  
  public void advising(Student student, String... courses) {
    if (!student.loginStatus) {
      System.out.println("Please login to advise courses!");
    }
    else if (courses.length > 3) {
      System.out.println("You need special approval to take more than 3 courses.");
    }
    else {
      for (int i = 0; i < courses.length; i++) {
        student.courses[i] = courses[i];
      }
      updateAdvisee(student);
    }
  }
  
  private void updateAdvisee(Student student) {
    if (totalAdvisee >= 5) {
      System.out.println("Maximum advisees reached!");
      return;
    }
    
    for (Student s : advisees) {
      if (s != null && s.id == student.id) {
        System.out.println("Advising successful!");
        return;
      }
    }
    
    advisees[totalAdvisee] = student;
    totalAdvisee++;
    System.out.println("Advising successful!");
  }
  
  public void allAdviseeInfo() {
    System.out.println("Total Advisee: " + totalAdvisee);
    for (int i = 0; i < advisees.length; i++) {
      if (advisees[i] != null) {
        System.out.println("Name: " + advisees[i].name + " ID: " + advisees[i].id);
        System.out.println("Department: " + advisees[i].department);
        System.out.print("Advised Courses: ");
        for (int j = 0; j < advisees[i].courses.length; j++) {
          if (advisees[i].courses[j] != null) {
            System.out.print(advisees[i].courses[j] + " ");
          }
        }
        System.out.println("\n==========");
      }
    }
  }  
}