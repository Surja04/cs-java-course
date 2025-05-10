public class Reader
{
  public String name;
  public int capacity;
  public String book_list[] = new String [5];
  public int book_count = 0;
  
  public void addBook(String book)
  {
    if(book_count < capacity)
    {
      book_list[book_count] = book;
      book_count++;
    }
    else
    {
      System.out.println("No more capacity");
    }
  }
  public void readerInfo()
  {
    System.out.println("Name: "+name);
    System.out.println("Capacity: "+capacity);
    if(   book_count == 0)
    {
      System.out.println("Books:");
      System.out.println("No books added yet");
    }
    else
    {
      System.out.println("Books:");
        for(int i = 0 ; i < book_count; i++)
      {
        System.out.println("Book "+(i+1)+": "+book_list[i] );
      }
    }
  }
  public String createReader(String name, int capacity)
  {
    this.name = name;
    this.capacity = capacity;
    String s = "A new reader is created!";
    return s;
  }
  
}