public class Vaccine
{
  private String nm;
  private String region;
  private int validity;
  
  public Vaccine(String n, String reg,int val)
  {
    nm = n;
    region = reg;
    validity = val;
  }
  public String getName()
  {
    return nm;
  }
  
  public String getRegion()
  {
    return region;
  }
  
  public int getValidity()
  {
    return validity;
  }
}
