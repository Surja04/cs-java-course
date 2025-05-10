public class Nokia extends Mobile
{
  public double balance;
  public Nokia(String a, boolean b, String c, int d)
  {
    super(a,c,b);
    balance = (double)d;
  }
  public String toString()
  {
    System.out.println(super.toString());
    String a = ("Balance: "+balance);
    return a;
  }
  public String dialCall(String s)
  {
    if(balance > 0)
    {
      if(!super.simCardStatus)
      {
         System.out.print("No SIM card available! Please check" + 
                             "the SIM card connectivity."); 
         return "";                                  
      }
      else
      {
        String code = "";
        for(int i = 0; i < 3; i++)
        {
          code = code+s.charAt(i);
        }
        if(getCountryName(code) == null)
        {
          String value = "Dialing is not allowed in this region";
          return value;
        }
        else{
        String value = ("Dialing the number "+s+" to "+
                           getCountryName(code)+" region");
        return value;
        }
      }
    }
    else
    {
      String  value = ("Insufficient balance! Please recharge.");
      return value;
    }
  }
  public void rechargeSIMCard(int r)
  {
    balance = balance+(double)r;
    System.out.println("Recharge Successful! Current balance "+
                       balance+" TK.");
  }
}