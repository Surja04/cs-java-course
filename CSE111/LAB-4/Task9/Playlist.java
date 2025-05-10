public class Playlist
{
  public String name;
  public Song start;
  public Song s;
  
  public Playlist(String p)
  {
    name = p;
    System.out.println(name+"created");
    start = null;
  }
  public void addSong(Song new_song)
  {
    if(start == null)
    {
      start = new_song;
    }
    else
    {
      s = start;
      if(s.next != null)
      {
        s = s.next;
      }
      else
      {
        s.next = new_song;
        break;
      }
    }
    
  }
}