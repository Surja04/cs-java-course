public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = 
  {"Pather Panchali","Durgesh Nandini", "Anandmath"};
//  public static remainingBooks;
  public String name;
  public String borrowed_books [] = new String [3];
  public int count;
  
  public Borrower(String nm)
  {
    name = nm;
  }
  public void borrowBook(String book)
  {
    for(int i = 0; i < book_name.length; i++)
    {
      if(book.equals(book_name[i]))
      {
        if(book_count[i]>0)
        {
          borrowed_books [count] =  book_name[i];
          count++;
          book_count[i]--;
          return;
        }       
      }
    }
    System.out.println("This book is not available.");
  }
  public void borrowerDetails()
  {
    System.out.println("Name: "+name);
    System.out.println("Books Borrowed: ");
    for(int i = 0; i < count; i++ )
    {
      System.out.println(borrowed_books[i]);
      
    }
//    System.out.println("p "+book_count[i]);
  }
  public static void bookStatus()
  {
    System.out.println("Available Books:");
    for(int i = 0; i< book_count.length; i++)
    {
      System.out.println(book_name[i]+": "+book_count[i]);
    }
  }
  public static int remainingBooks(String book)
  {
    int a = 0;
    for(int i = 0; i< book_count.length; i++)
    {
      if(book_name[i].equals(book))
      {
        if(book_count[i] >= 0)
        {         
          a = book_count[i];
          break;
        }               
      }
    }
    return a;
  }
  
  
}