public class Book
{
  public static int total_books_sold = 0;
  public static double total_revenue = 0.0;
  public double price = 150.0;
  public String name;
  public double discount;
  public Book(String nm, int dis)
  {
   name = nm;
//   System.out.println("Title: "+name);
   discount = (double)dis;
   price = discountPrice(price,discount);
   total_books_sold++;
  }
  public double discountPrice(double pr, double dis)
  {
    price = price - (price*dis/100);
//    System.out.println(price);
    total_revenue = total_revenue + price;
//    System.out.println(total_revenue);
    return price;
    
  }
  public void bookDetails()
  {
    System.out.println("Title: "+name);
    System.out.println("Price after discount: "+price+" Tk");
  }
}