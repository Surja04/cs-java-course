public class TaxiLagbe
{
  public String t_number;
  public String area;
  public int p_count=0;
  public String p_lists [] = new String [26];
  public int fare=0;
  
  public void storeInfo(String number, String ar_ea )
  {
    t_number = number;
    area = ar_ea;
  }
  public void printDetails()
  {
    System.out.println("Taxi number: "+t_number);
    System.out.println("This taxi can cover "+area+ " area");
    System.out.println("Total Passenger: "+p_count);
    if(p_count==0){
      System.out.println("Passenger Lists:");
      System.out.println("Total collected fare: "+fare+" Taka");
    }
    else{
      System.out.println("Passenger Lists:");
      for(int i = 0; i < p_count;i++)
      {
        System.out.print(p_lists[i]+" ");
      }
      System.out.println();
      System.out.println("Total collected fare: "+fare+" Taka");
    }
   
    
  }
   int limit_crossed =0;
  public void addPassenger(String name, int taka)
  {
    if(p_count<4)
    {
      p_lists[p_count]= name;
      System.out.println("Dear "+p_lists[p_count]+"! Welcome To TaxiLagbe");
      p_count++;
      fare = fare+taka;
      
    }
   
    if(p_count == 4 && limit_crossed !=  p_count + 1 )
    {
      System.out.println("Taxi Full! No more passengers can be added");
       limit_crossed = p_count + 1;
    }
  }
  public void addPassenger(String name1, int taka1,String name2, int taka2)
  {
    if(p_count<4)
    {
      p_lists[p_count]= name1;
      System.out.println("Dear "+p_lists[p_count]+"! Welcome To TaxiLagbe");
      p_count++;
      fare = fare+taka1;
     
    }
    if(p_count<4)
    {
      p_lists[p_count]= name2;
      System.out.println("Dear "+p_lists[p_count]+"! Welcome To TaxiLagbe");
      p_count++;
      fare = fare+taka2;
      
    }
  }
}