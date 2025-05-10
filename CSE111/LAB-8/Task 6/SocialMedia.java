public class SocialMedia{
  public String userName;
  public String email;
  public SocialMedia(String name,String gmail){
    userName=name;
    email=gmail;
  }
  @Override
  public String toString(){
    return userName+"'sprofile:"+"\nUserName: "+userName+"\nEmail:"+email;
  }
}