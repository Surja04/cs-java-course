public class Mango extends Fruit
{
  public Mango()
  {
    super(true,"Mango");
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