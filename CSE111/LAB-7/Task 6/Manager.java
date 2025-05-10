public class Manager extends Employee
{
  public double bonus;
  public double final_salary;
  public double d;
  
  public Manager(String nm, int sal, int wrk,int bon)
  {
    super(nm,sal,wrk);
    bonus = bon;
     
  }
  public void calculateSalary()
  {
    if(super.getHoursWorked() >40)
    {
      final_salary = super.getBaseSalary()+(super.getBaseSalary()*bonus/100);
    }
    else if(super.getHoursWorked() <= 40)
    {
      final_salary = super.getBaseSalary();
    }
  }
  public void requestIncrement(int t)
  {
        if(super.getHoursWorked() > 100)
    {
        System.out.println(t+" $ Increment approved."); 
        d =  getBaseSalary()+ t;
        setBaseSalary(d);
    }
        else if(super.getHoursWorked() >= 80 && super.getHoursWorked() <= 100)
        {
          double a = t/2;
          System.out.println(t/2+" $ Increment approved."); 
          d =  getBaseSalary()+ t/2;
          setBaseSalary(d);
          
        }
        else
        {
          System.out.println("Increment denied.");
        }
  }
  public void displayInfo()
  {
    super.displayInfo();
    System.out.println("Bonus " + bonus+" %");
    System.out.println("Final Salary: " + final_salary);
  }
}