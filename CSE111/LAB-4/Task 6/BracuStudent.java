public class BracuStudent
{
  public String name;
  public String place;
  public boolean getPass = false;
  
  public BracuStudent(String name, String place)
  {
    this.name = name;
    this.place = place;
  }
  public void getPass()
  {
    getPass = true;
  }
  
  public void showDetails()
  {
    System.out.println("Student Name: "+name);
    System.out.println("Lives in"+place);
    System.out.println("Have Bus Pass? "+getPass);
  }

}