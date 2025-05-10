public class Jackfruit extends Fruit
{
  public Jackfruit()
  {
    super(false,"Jackfruit");
  }
  public String toString()
  {
    if(super.hasFormalin())
    {
      System.out.println(super.getName()+"s are bad for you");
      return "";
    }
    else
    {
      System.out.println(super.getName()+"s are good for you");
      return "";
    }
    
  }
}