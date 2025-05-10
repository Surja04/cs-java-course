public class Player
{
  public static int total = 0;
  public static String enlisted_players[] = new String[11];
  public static int count = 0;
  public String name;
  public int jersey_no;
  public String country;
  
  public Player(String nm, String co, int jer)
  {
    if(total<12)
    {
      name = nm;
      jersey_no = jer;
      country = co;
      total++;
      enlisted_players[count]=nm;
      count++;
    }
  }
  public String player_detail()
  {
    String s ="Jersey Number: " +String.valueOf(jersey_no);
    String n = "Player name: "+name;
    String c = "Country: "+country;
    return n+"\n"+s+"\n"+c;
  }
  public static void info()
  {
    System.out.println("Total number of players: "+total);
    System.out.print("Players enlisted so far: ");
    
    for(int i = 0; i < count; i++)
    {
      if(total == 1 || i == count-1)
      {
        System.out.print(enlisted_players[i]+" ");
      }
      else
      {
        System.out.print(enlisted_players[i]+", ");
      }
    }
    System.out.println();
  }
}