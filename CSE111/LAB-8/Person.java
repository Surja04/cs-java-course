public class Person
{
  public String name;
  public int age;
  public String type;
  public Vaccine vaccine_list [] = new Vaccine [3];
  public int count = 0;
  public static int vac_count;
  public String first_dose;
  public String second_dose;
  public String dose;
  public boolean is_first_given;
  public boolean is_second_given;
  public boolean isUnderAge;
  
  public Person(String n, int a, String t )
  {
    name = n;
    age = a;
    type = t;
  }
  public Person(String n, int a )
  {
    name = n;
    age = a;
    type = "General Citizen";
    
  }
  public void pushVaccine(Vaccine a)
  {
    System.out.println(vac_count);
    if(vac_count == 1 && age < 25)
    {
      System.out.println("Sorry "+name+"  Minimum age for taking vaccine is 25 years now");
      
    }
    else
    {
      vaccine_list[count] = a;
      count++;
      dose = a.getName();
      if(first_dose == null)
      {
        first_dose = "Given";
        is_first_given = true;
        System.out.println("First dose done for "+name);
        System.out.println("lmao");
        second_dose = "Come after "+a.getValidity()+" Days";
      }
    }
  }
  public void pushVaccine(Vaccine a,String s)
  {
    if(vac_count==1 && age < 25)
    {
      System.out.println("Sorry "+name+"  Minimum age for taking vaccine is 25 years now");
      return ;
    }
    if(dose == null)
    {
      if(s.equals("1st Dose"))
      {
        dose = a.getName();
        first_dose = "Given";
        System.out.println(s +" done for "+name);
        second_dose = "Please come after "+a.getValidity()+" days. ";
        is_first_given = true;
      }
      else if(is_first_given)
      {
        if(s.equals("2nd Dose"))
        {
          second_dose = "Given";
          System.out.println(s+" done for "+name);
          vac_count++;
          System.out.println(vac_count);
        }
      }
      else
      {
        System.out.println("Sorry "+name+ ", invalid dose request.");
      }
    }
    else if(dose.equals(a.getName()))
    {
      if(is_first_given)
      {
        if(!is_second_given)
        {
          second_dose = "Given";
          is_second_given = true;
          System.out.println(s+" done for "+name);
          vac_count++;
          System.out.println(vac_count);
          
        }
        else
        {
          System.out.println("Sorry "+ name+ ", you already received both doses.");
        }
      }
//        else if(s.equals("1st dose"))
//        {
//          first_dose = "Given";
//          System.out.println(s +" done for "+name);
//        }
      else
      {
        System.out.println("Sorry "+name+", invalid dose request.");
      }        
    }
    
    else
    {
      System.out.println("Sorry "+name+", you can't take 2 different vaccines ");
    }
  }
  public void showDetail()
  {
    System.out.print("Name: "+name+" ");
    System.out.print("Age: "+age+" ");
    System.out.println("Type: "+type);
    System.out.println("Vaccine name: "+dose);
    System.out.println("1st dose: "+first_dose);
    System.out.println("2nd dose: "+second_dose);
  }
  
}