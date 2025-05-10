public class Shelf
{
  public int capacity=0;
  public int no_books=0;
  
  public void showDetails()
  {
    System.out.println( "Shelf capacity: "+capacity);
    System.out.println( "Number of books: "+no_books);
  }
  public void addBooks(int n)
  {
    int remaining_capacity = capacity - no_books;
    if(remaining_capacity > n)
    {
      no_books = no_books + n;
      System.out.println( n+" books added to shelf");     
      
    }
    else if(capacity==0)
    {
      System.out.println("Zero capacity. Cannot add books.");
    }
    else
    {
      System.out.println("Exceeds capacity");
    }
  }
}