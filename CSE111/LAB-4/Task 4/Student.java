public class Student
{
  public boolean setCg = false;
  public String course_list [] = new String [100];
  public int course_count = 0;
  public int id;
  public double cgpa;
  
  
  public Student(int id)
  {
    this.id = id;
    System.out.println("A student with ID " +id+" has been created.");
  }
  public void addCourse(String c)
  {
    if(!setCg)
    {
      System.out.println("Failed to add "+c);
      System.out.println("Set CG first");
      
    }
    
    else
    {
      if(cgpa >= 3 && course_count < 4)
      {
        course_list[course_count]=c;
        course_count++;
      }
      else if(cgpa < 3 && course_count < 3)
      {
        course_list[course_count]=c;
        course_count++;
      }
      else if(cgpa >= 3 && course_count >= 4)
      {
        System.out.println("Maximum "+course_count+" courses "+" allowed.");
      }
      else if(cgpa < 3 && course_count == 3)
      {
        System.out.println("Failed to add "+c);
        System.out.println("CG is low. Can't add more than 3 courses."); 
//        System.out.println("Mara kha"+course_count);
      }
    }
  }
  public void storeCG(double cgpa)
  {
    this.cgpa = cgpa;
    setCg=true;
  }
  public void showAdvisee()
  {
    System.out.print("Student ID: "+id+",");
    System.out.println("CGPA: "+cgpa);
    if(course_count == 0)
    {
      System.out.println("No courses added.");
    }
    else
    {
      System.out.println("Added courses are: ");
      
      
      for(int i = 0; i <course_count; i++ )
      {
        System.out.print(course_list[i]+" ");
      }
      System.out.println();
      
      
    }
  }
  public void removeAllCourse()
  {
    for(int i = 0; i <course_count; i++ )
    {
      course_list[i] = "";
    }    
    course_count = 0;
  }
  public void storeID(int id)
  {
    this.id = id;
  }
  public void addCourse(String s[])
  {

    if(cgpa >= 3 && course_count < 4)
    {
      for(int i = 0; i < 4; i++)
      {
        course_list[i] = s[i];
        course_count++;
      }
//      System.out.print("c"+course_count);
    }
       else if(s.length >= 4)
        {
        System.out.println("Failed to add "+ s[course_count]);
            System.out.println("Maximum 4 courses allowed.");
         }

    else if(cgpa < 3 && course_count < 3)
    {
      for(int i = 0; i < 3; i++)
      {
        course_list[i] = s[i];
        course_count++;
      }
      
      
    }
    else if(cgpa < 3 && course_count == 3)
    {
      System.out.println("CG is low. Can't add more than "+course_count+" course");
    }
    if(s.length >= 4)
    {
      System.out.println("Failed to add "+ s[course_count]);
      System.out.println("Maximum "+ course_count +" courses allowed.");
    }
    
  }
  public Student(int id, double cgpa)
  {
    this.id = id;
    this.cgpa = cgpa;
    System.out.println("A student with ID "+ id+ " and cgpa "+cgpa+" has been created.");
  }
  
  
}
