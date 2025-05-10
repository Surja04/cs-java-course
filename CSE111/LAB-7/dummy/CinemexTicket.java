public class CinemexTicket extends MovieTicket{
  private static int t_count = 0;
  private String genre;
  private String id;
  private boolean is_paid;
  public CinemexTicket(String m, String s, String g, String d){
    super(m, d, s, 0.0);
    genre = g;
    is_paid = false;
    super.seat = seatTypes[0];
    t_count++;
    id = unique_id();
  }
  public CinemexTicket(String m, String s, String g, String d, String seat_type){
    super(m, d, s, 0.0);
    genre = g;    
    super.seat = seat_type;
    is_paid = false;
    t_count++;
    id = unique_id();
  }
  private String unique_id()
  {
    char initials = seat.charAt(0);
    return getMovie() + "-" + initials + "-" + t_count;
  }
  public static int getTotalTickets(){
    return t_count;
  }
  public void calculateTicketPrice(){
    int s_index = -1;
    for (int i = 0; i < seatTypes.length; i++){
      if (seatTypes[i].equals(seat)){
        s_index = i;
        break;
      }
    }
    if (s_index != -1){
      double initial_price = seatPrices[s_index];
      int time_hour = 0;
      char first_digit = showtime.charAt(0);
      char second_digit = showtime.charAt(1);
      
      if (Character.isDigit(first_digit) && Character.isDigit(second_digit)){
        time_hour = (first_digit - '0') * 10 + (second_digit - '0');
      }
      if (time_hour >= 18 && time_hour <= 23){
        initial_price += initial_price * nightShowCharge / 100.0;
      }
      setPrice(initial_price);
      System.out.println("Ticket price is calculated successfully.");
    } 
    else{
      System.out.println("Invalid seat type.");
    }
  }
  public String confirmPayment(){
    if (is_paid){
      return "Ticket price is already paid!";
    } 
    else{
      is_paid = true;
      return "Payment Successful.";
    }
  }
  public String toString(){
    String payment_stats;
    if(is_paid){
      payment_stats ="Paid";
    }
    else{
      payment_stats ="Not Paid";
    }
    return "Ticket ID: " + id + "\n" +"Movie: " + getMovie() + "\n" +"Showtime: " + showtime + "\n" +"Date: " + date + "\n" +"Genre: " + genre + "\n" +"Seat Type: " + seat + "\n" +"Price(tk): " + getPrice() + "\n" +"Status: " + payment_stats;
  }
}
