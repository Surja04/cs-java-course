public class Usis
{
  public int totalAdvisee=0;
  public Student adviseeList [] = new Student [5];
//  public boolean needSpace = true;
  
  public Usis ()
  {
    System.out.println("Usis is ready to use!");
  }
  public void login(Student st )
  {
    if(st.email != null && st.password != null)
    {
      System.out.println("Login Successful");
      st.isLoggedIn = true;
    }
    else
    {
      System.out.println("Email and password need to be set");
    }
  }
  public void advising(Student st)
  {
    if(st.isLoggedIn == true)
    {
//      adviseeList[totalAdvisee] = st;
//      totalAdvisee++;
      
      if(st.course_count == 0)
      {
        System.out.println("You haven't selected any courses.");
      }
    }
    else
    {
      System.out.println("Please login to advise courses!");
    }
  }
  public void advising(Student st, String c1,String c2,String c3,String c4)  
  {
    System.out.println("You need special approval to take more than 3 courses.");
  }
  public void advising(Student st, String c1,String c2,String c3)  
  {
    if(totalAdvisee<5)
    {
      adviseeList [totalAdvisee] = st;
      adviseeList [totalAdvisee].enrolledCourses[st.course_count]=c1;
      st.course_count++;
      adviseeList [totalAdvisee].enrolledCourses[st.course_count]=c2;
      st.course_count++;
      adviseeList [totalAdvisee].enrolledCourses[st.course_count]=c3;
      st.course_count++;
      totalAdvisee++;
      System.out.println("Advising Successful!");
    }
  }
  public void allAdviseeInfo()
  {
    System.out.println("Total Advisee: "+totalAdvisee);
    
    for(int i = 0; i < totalAdvisee; i++)
    {
      System.out.print("Name: "+adviseeList[i].fullName);
      System.out.println(" "+"ID: "+adviseeList[i].studentId);      
      System.out.println("Department: "+adviseeList[i].dept);
      System.out.println("Advised Courses: ");     
      
      for(int j = 0; j < 3; j++)
      {
        System.out.print(adviseeList [i].enrolledCourses[j]+" "); 
      }
      System.out.println();
      

      if(i == 0)
      {
         System.out.println("===========");
      }
      else if(i < totalAdvisee-1)
      {
         System.out.println("===========");
      }

                  
    }
      
    
  }
  
}