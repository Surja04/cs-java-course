public class BracuBus
{
  public String route;
  public int max_p_count =2;
  public int p_count = 0;
  public BracuStudent p_on_board[] = new BracuStudent[100];
  
  public BracuBus(String route)
  {
    this.route = route;
  }
  public BracuBus(String route, int max_p_count)
  {
    this.route = route;
    this.max_p_count = max_p_count;
  }
  public void showDetails()
  {
    System.out.println("Bus Route: "+route);
    System.out.println("Passenger Count: "+p_count+"(Max:"+max_p_count+")");
    System.out.println("Passengers on board: ");
  }
  public void board()
  {
    System.out.println("No passengers");
  }
  public void board(BracuStudent st_d, bracuStudent st_e)
  {
    if(p_count<max_p_count)
    {
      if(st_d.getPass)
      {
        p_on_board[p_count] = st_d;
        System.out.println( p_on_board[p_count].name+"boarded the bus");
        p_count++;
      }
      if(!st_d.getPass)
      {
        System.out.println("You don't have a bus pass!");
        System.out.println("You got on the wrong bus!");
      }
    }
    if(p_count<max_p_count)
    {
      if(st_e.getPass)
      {
        p_on_board[p_count] = st_e;
        System.out.println( p_on_board[p_count].name+"boarded the bus");
        p_count++;
      }
      if(!st_e.getPass)
      {
        System.out.println("You don't have a bus pass!");
        System.out.println("You got on the wrong bus!");
      }
    }     
    else
    {
      System.out.println("Bus is Full!");
    } 
  }
  

}