public class CheckingAccount extends Account
{
  public static int count=0;
//  public double ln = 0.0;
 
  
  public CheckingAccount()
  {
   super(0.0);
   count++;
  }
    public CheckingAccount(double blnc)
  {
   super(blnc);
   count++;
  }
}