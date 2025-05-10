public class Student
{
  public String name="Not set";
  public String dept = "CSE";
  public double cg = 0.0;
  public int credits = 9;
  public String scholarship = "Not Set";
  
  public void showDetails()
  {
    System.out.println("Name: "+name);
    System.out.println("Department: "+dept);
    System.out.println("CGPA: "+cg);
    System.out.println("Credits: "+credits);
    System.out.println("Scholarship Status: "+scholarship);
  }
  public void updateDetails(String name, double cg, int credits)
  {
    this.name = name;
    this.cg = cg;
    this.credits = credits;
  }
  public void updateDetails(String name, double cg)
  {
    this.name = name;
    this.cg = cg;
  }
  public void updateDetails(String name, double cg, int credits, String dept)
    
  {
    this.name = name;
    this.cg = cg;
    this.credits = credits;
    this.dept = dept;
  }
  public void checkScholarshipEligibility()
  {
    if(cg >= 3.5 && credits>10)
    {
      if(cg>=3.7 && cg <= 4.0)
      {
        scholarship = "Merit based scholarship";
        System.out.println(name+" is eligible for "+scholarship);
      }
      else if(cg >= 3.5 && cg < 3.7)
      {
        scholarship = "Need based scholarship";
        System.out.println(name+" is eligible for "+scholarship);
      }
      
    }
    else
    {
      scholarship = "No scholarship";
      System.out.println(name+" is not eligible for scholarship");
    }
  } 
}