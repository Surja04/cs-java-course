//Task 8;
public class Employee
{
  public String name;
  public double salary = 30000.0;
  public String designation = "Junior";
  
  public void newEmployee (String s)
  {
    name = s;
  }
  public void displayInfo()
  {
    System.out.println("Employee Name: "+name);
    System.out.println("Employee salary: "+salary+" Tk");
    System.out.println("Employee designation: "+designation);
  }
  
  public void calculateTax()
  {
    double tax=0.0;
    if(salary > 30000 && salary <= 50000)
    {
      tax = salary*(10.00/100.0);
      System.out.println(name+" tax amount "+tax);
    }
    if(salary > 50000)
    {
      tax = salary*(30.00/100.0);
      System.out.println(name+" tax amount "+tax);
    }
    else
    {
      System.out.println("No need to pay tax");
    }   
  }
  public void promoteEmployee(String p)
  {
    designation = p;
    if(p.equals("senior"))
    {
      salary = salary + 25000.0;
    }
    else if(p.equals("lead"))
    {
      salary = salary + 50000.0;
    }
    else if(p.equals("manager"))
    {
      salary = salary + 75000.0;
    }
    System.out.println(name+" has been promoted to "+designation);
    System.out.println("New Salary: "+ salary );
  }
}