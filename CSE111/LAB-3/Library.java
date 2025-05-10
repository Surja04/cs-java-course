public class Library
{
  public int capacity;
  public int no_books;
  public String b_name[]=new String [26];
  
  public void setBookCapacity(int n1)
  {
    capacity += n1;
    
  }
  public void addBook(String n2)
  {
    if(no_books == (capacity))
    {
      System.out.println("Maximum capacity exceeds. You can't add more than "+ no_books+ " books");
    }
    else
    {
      b_name[no_books] = n2;
      System.out.println("Book " + "'"+n2+"'"+ " added to the library");
      no_books++;
    }
  }
  public void printDetail()
  {
    System.out.println("Maximum Capacity: "+capacity);
    System.out.println("Total Books: "+no_books);
    System.out.println("Book List:");
    
    for(int i = 0; i < no_books; i++)
    {
      System.out.println(b_name[i]);
    }
  }
}