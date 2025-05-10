// Design class for Task 7;
public class CellPhone{
  public String model = "unknown";
  public int contact;
  public String info[] = new String [3];
  
  public void printDetails()
  {
    System.out.println("Phone model "+model);
//    System.out.println("Contacts stored "+contact);
    if(contact >= 0 && contact <= 3)
    {
      System.out.println("Contacts stored "+contact);
      if(contact>0)
      {
      System.out.println("Stored Contacts:");
      }
      for(int i=0; i < contact; i++ )
      {
        System.out.println(info[i]);
      }
    }
  }
  int count =0;
    public void storeContact(String info)
    {
      contact++;
      
      if(contact > 0 && contact <= 3)
      {
        System.out.println("Contact Stored");
        this.info[count] = info;
        count++;
        
      }
      else
      {
        System.out.println("Memory full. New contact can't be stored.");
      }
    }
  
}

