public class Building_test
{
  public static void main(String[]args)
  {
    Building b1 = new Building ();
    Building b2 = new Building ();
    b1.doors = 2;
    b1.windows = 3;
    b2.doors = 5;
    b2.windows = 6;
    
    System.out.println("b1===============");
    b1.view();
    System.out.println("b2===============");
    b2.view();
    System.out.println("b1 Doors===============");
    b1.increaseDoors();
    System.out.println("b2 Doors===============");
    b2.increaseDoors();
  }
}