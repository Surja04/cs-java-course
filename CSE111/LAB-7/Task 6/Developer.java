public class Developer extends Employee
{
//  public int bonus;
  public String skill;
  public double final_salary;
  
  public Developer(String nm, int sal, int wrk, String sk)
  {
    super(nm,sal,wrk);
    skill = sk;    
  }
  public void calculateSalary()
  {
    if(skill.equals("Java"))
    {
      final_salary = getBaseSalary()+700;
    }
    else
    {
       final_salary = getBaseSalary();
    }
  }
  public void displayInfo()
  {
    super.displayInfo();
    System.out.println("Language: "+skill);
    System.out.println("Final Salary: "+final_salary);
  }
}