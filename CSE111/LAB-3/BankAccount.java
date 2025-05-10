public class BankAccount
{
  public int acc_no = 0;
  public String acc_type = "Not Set";
  
  public String printDetails()
  {
    return "Account No: "+acc_no+"\n"+"Type: "+acc_type;
  }
  public void setInfo(int n, String t)
  {
    acc_no = n;
    acc_type = t;
    System.out.println("Account information updated!t");
  }
}