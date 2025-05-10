public class CinemexTicket extends MovieTicket{
  private static int ticketCount = 0;
  private String genre;
  private String ticketID;
  private boolean isPaid;
  public CinemexTicket(String movie, String showtime, String genre, String date){
    super(movie, date, showtime, 0.0);
    this.genre = genre;
    this.isPaid = false;
    this.seat = seatTypes[0];
    ticketCount++;
    this.ticketID = generateTicketID();
  }
  public CinemexTicket(String movie, String showtime, String genre, String date, String seatType){
    super(movie, date, showtime, 0.0);
    this.genre = genre;
    this.isPaid = false;
    this.seat = seatType;
    ticketCount++;
    this.ticketID = generateTicketID();
  }
  private String generateTicketID(){
    char seatInitial = seat.charAt(0);
    return getMovie() + "-" + seatInitial + "-" + ticketCount;
  }
  public static int getTotalTickets(){
    return ticketCount;
  }
  public void calculateTicketPrice(){
    int seatIndex = -1;
    for (int i = 0; i < seatTypes.length; i++){
      if (seatTypes[i].equals(seat)){
        seatIndex = i;
        break;
      }
    }
    if (seatIndex != -1){
      double basePrice = seatPrices[seatIndex];
      int hour = 0;
      char firstDigit = showtime.charAt(0);
      char secondDigit = showtime.charAt(1);
      
      if (Character.isDigit(firstDigit) && Character.isDigit(secondDigit)){
        hour = (firstDigit - '0') * 10 + (secondDigit - '0');
      }
      if (hour >= 18 && hour <= 23){
        basePrice += basePrice * nightShowCharge / 100.0;
      }
      setPrice(basePrice);
      System.out.println("Ticket price is calculated successfully.");
    } 
    else{
      System.out.println("Invalid seat type.");
    }
  }
  public String confirmPayment(){
    if (isPaid){
      return "Ticket price is already paid!";
    } 
    else{
      isPaid = true;
      return "Payment Successful.";
    }
  }
  public String toString(){
    String paymentStatus;
    if(isPaid){
      paymentStatus ="Paid";
    }
    else{
      paymentStatus ="Not Paid";
    }
    return "Ticket ID: " + ticketID + "\n" +
      "Movie: " + getMovie() + "\n" +
      "Showtime: " + showtime + "\n" +
      "Date: " + date + "\n" +
      "Genre: " + genre + "\n" +
      "Seat Type: " + seat + "\n" +
      "Price(tk): " + getPrice() + "\n" +
      "Status: " + paymentStatus;
  }
}