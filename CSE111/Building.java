public class Building
{
  public int doors;
  public int windows;
  
  public void view()
  {
    System.out.println(doors+" Doors");
    System.out.println(windows+" Windows"); 
  }
  public void increaseDoors()
  {
    doors = doors+1;
    System.out.println(doors+" Doors");
  }
}