public class EBook extends Book
{
  public String format;
  public double storage;
  public double total_price;
  public int downloads;
  public static int id;
  public int count;
  
  
  public EBook(String nm,String aut, double bp, String form,double str)
  {
    super(nm,aut,bp);
    format = form;
    storage = str;
    total_price = storage + super.calculatePrice();
    id++;
    count=id;
  }
  public void details()
  {
    super.details();
    System.out.println("Format: "+format);
    System.out.println("Storage :"+storage);
    System.out.println("Total Price :"+total_price);
    System.out.println("Downloads "+downloads);
    System.out.println("ID :"+"EBook-"+count);
  }
  public boolean isMoreExpensiveThan(EBook e)
  {
    return total_price>e.total_price;
  }
  @Override
  public double calculatePrice() {
    return total_price;
  }

}