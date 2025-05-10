public class Song
{
  public String name;
  public String artist;
  public int leng;
  public Song next;
  
  public Song(String n, String a, int l)
  {
    name = n;
    artist = a;
    leng = l;
    next = null;
  }
  public void songInfo()
  {
    System.out.println("Title: "+name);
    System.out.println("Artist: "+artist);
    System.out.println("Length: "+leng +" minutes");
  }
}