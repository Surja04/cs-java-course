public class Passenger
{
  public static int no_of_passenger = 0;
  public static double total_fare = 0.0;
  public String name;
  public double distance;
  public double fare;
  public Passenger(String nm,double distance)
  {
    name = nm;
    this.distance = distance;
    fare = 20.0*distance;
    total_fare = total_fare+fare; 
    no_of_passenger++;
//    System.out.println("1 "+total_fare);
    
  }
  public void passengerDetails()
  {
    System.out.println("Name: "+name);
    System.out.println("Fare: "+fare+" Tk");    
//    System.out.println("total faree: "+total_fare);
  }
  public void storeBaggageWeight(double weight)
  {
    fare = fare + (weight*10.0);    
    total_fare = total_fare + (weight*10.0);
  }
}