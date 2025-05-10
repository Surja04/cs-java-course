public class Bondhus extends SocialMedia
{
  public String s_chatbox[] = new String[1000];
  public int s_count=0;
//  public String p_chatbox[] = new String [100000000000];
//  public int p_count;
//  public String l_chatbox[] = new String [100000000000];
//  public String l_count;
  public Bondhus(String nm,String gmail)
  {
    super(nm,gmail);
  }
  public void showSentbox()
  {
    System.out.println(userName+"s "+"Sentbox:" );
    if(s_chatbox[0]==null)
    {
      System.out.println("No sent messages.");
      return;
    }
    else 
    {
      for(int i =0; i< s_count; i++)
      {
        System.out.println(s_chatbox[i]);
      }
    }
    
  }
  public void sendMessage(String msg)
  {
    s_chatbox[s_count]=msg;
    s_count++;
  }
  public String toString()
  {
    System.out.println(super.toString());
    System.out.println("Messages Sent: "+s_count);
    return "";
  }
}