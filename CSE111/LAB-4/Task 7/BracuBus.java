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
    System.out.println("Passengers on Board: ");
    for(int i = 0; i < p_count; i++)
    {
      System.out.print(p_on_board[i].name+" ");
    }
  }
  public void board()
  {
    System.out.println("No passengers");
  }
  public void board(BracuStudent st_d, BracuStudent st_e)
  {
    
    if(p_count < max_p_count)
    {
      if(st_d.getPass)
      {
        if(route.equals(st_d.place))
        {
          p_on_board[p_count] = st_d;
          System.out.println(p_on_board[p_count].name+" boarded the bus");
          p_count++;
        }
        else
        {
          System.out.println("You got on the wrong bus!");
        }
      }
      else
      {
        System.out.println("You don't have a bus pass!");
      }
    }
    if(p_count < max_p_count)
    {
      if(st_e.getPass)
      {
        if(route.equals(st_e.place))
        {
          p_on_board[p_count] = st_e;
          System.out.println(p_on_board[p_count].name+" boarded the bus");
          p_count++;
        }
        else
        {
          System.out.println("You got on the wrong bus!");
        }
      }
      else
      {
        System.out.println("You don't have a bus pass!");
      }
    }
    else
    {
      System.out.println("Bus is full!");
    } 
  }     
  
  
  public void board(BracuStudent st)
  {
    if(p_count < max_p_count)
    {
      if(st.getPass)
      {
        if(route.equals(st.place))
        {
          p_on_board[p_count] = st;
          System.out.println(p_on_board[p_count].name+" boarded the Bus");
          p_count++;
        }
        else
        {
          System.out.println("You got on the wrong bus!");
        }
      }
      else
      {
        System.out.println("You don't have a bus pass!");
      }
    }    
    
    else
    {
      System.out.print("Bus is full!");
    }
  }
  
  
}