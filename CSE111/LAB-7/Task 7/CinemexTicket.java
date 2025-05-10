public class CinemexTicket extends MovieTicket
{
  private static int t_count = 0;  
  public String id;
  public String genre;
  public boolean is_paid;
  public CinemexTicket(String m, String s, String g, String d){
    super(m, d, s, 0.0);
    genre = g;
    is_paid = false;
    super.seat = seatTypes[0];
    t_count++;
   
  }
  public CinemexTicket(String m, String s, String g, String d, String seat_type)
  {
    super(m, d, s, 0.0);
    genre = g;    
    super.seat = seat_type;
    is_paid = false;
    t_count++;
    
  }

  public static int getTotalTickets(){
    return t_count;
  }

  public String toString()
  {

    return "Ticket ID: " + id + "\n" +"Movie: " + getMovie() + "\n" +"Showtime: " + showtime + "\n" +"Date: " + date + "\n" +"Genre: " + genre + "\n" +"Seat Type: " + seat + "\n" +"Price(tk): " + getPrice() + "\n" +"Status: " + payment_stats;
  }
  


}
