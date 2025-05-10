public class method_practice_test
{
  public static void main (String[]args)
  {
    method_practice s1 = new method_practice();
    method_practice s2 = new method_practice();
    s1.name="bob";
    s1.id = 23;
    s2.name="Carol";
    s2.id = 22;
    s1.showDetails();
    
    s2.showDetails();
  }
}