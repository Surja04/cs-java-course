public class Playlist
{
  public String name;
  public Song start;
  public Song s ;
  public int count;
  public int index;
  
  public Playlist(String p)
  {
    name = p;
    System.out.println(name+" created");
    start = null;
    s = null;
    count = 0;
    index = 1;
  }
  public void addSong(Song new_song)
  {
    if(start == null)
    {
      start = new_song;
      System.out.println(new_song.name+" added to "+name);
      count++;
    }
    else
    {
      s = start;
      while(true)
      {
        if(s.next != null)
        {
          s = s.next;
        }
        else
        {
          s.next = new_song;
          System.out.println(new_song.name+" added to "+name);
          count++;
          break;
        }
      }
    }
    
  }
  public void info()
  {
    int local_counter = 1;
    System.out.println(name+" has the following songs:");
    s = start;
    if(s==null)
    {
      System.out.println("No songs in "+name);
    }
    else{
      while(s!=null){
        
        System.out.println("Song-"+local_counter+":");
        System.out.println("Title: "+s.name);
        System.out.println("Artist: "+s.artist);
        System.out.println("Length: "+s.leng+" minutes"); 
        local_counter++;
        s=s.next;
      }
    }    
  }
  public void addSong(Song new_song, int ind)
  {   
    s = start;
//    count = 0;
    if(ind == 0)
    {
      new_song.next = start ;
      start = new_song;
      count ++;
      System.out.println(new_song.name +" added to "+name);
    }
    else if(ind>count){
      System.out.println("Cannot add song to Index 10.");
//      System.out.println(ind + ""+ count);
    }
    else
    {
      Song temp=start;
      for(int i = 0; i < ind-1; i++)
      {
//        System.out.println(temp.name);
        temp = temp.next;
      }
      Song s_temp = temp.next;
      temp.next = new_song;
      new_song.next = s_temp;
      count++;
      System.out.println(new_song.name +" added to "+name);     
      
    }
  }
  public void playSong(String title)
  {
    s = start;
    
    while(s != null)
    {
      String t = s.name;
      if(t.equals(title))
      {
        System.out.println("Playing "+title+" by "+s.artist);
        break;
      }
      
      else
      {
        if(s.next == null)
        {
          if(!t.equals(title))
          {
            System.out.println(title+"  not found in "+name);
            
            
          }
        }
        s = s.next;
        
      }
    }
    
  }
  public void playSong(int ind)
  {
    s = start;
    if(ind == 0)
    {
      System.out.println("Playing "+s.name+" by "+s.artist);
    }
    else if(ind > count)
    {
      System.out.println("Song at Index "+ind+" not found in "+name);
    }
    else
    {
      for(int i = 0; i < ind; i++)
      {
        s = s.next;
      }
      System.out.println("Playing "+s.name+" by "+s.artist);
    }
  }
  public void deleteSong(String song)
  {
    s = start;
    if(s.name.equals(song))
    {
      start = start.next;
      System.out.println(song+" deleted  from "+name);
      return;
    }

      while(s.next != null)
      {
        if(s.next.name.equals(song))
        {
          s.next = s.next.next;
          System.out.println(song+" deleted  from "+name);
          return;       
        }
        s = s.next;
      }    
       System.out.println(song+" not found in "+name);    
  }
  public int totalSong()
  {
    s = start;
    int song_count = 0;
    while(true)
    {
      if(s.next!=null)
      {
         s = s.next;
         song_count++;
      }

      else
      {
        song_count++;
        break;
      }
    }
    
    return song_count;
  }
  public void merge(Playlist p)
  {
    s = start;
    while(s.next != null)
    {
      s = s.next;
    }
    s.next = p.start;
    System.out.println("Merge Completed!");
  }
  
}