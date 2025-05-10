public class Book extends Product
{
  int isbn ;
  
  public Book(String n, int i, int p)
  {
    super(n,p);
    isbn = i;
  }
  
  @Override
  public void details()
  {
    super.details();
    System.out.println("ISBN Number: "+isbn);
    
  }
  
  public void increasePrice(int p)
  {
    this.price += p;
    System.out.println("price has increased");
  }
}