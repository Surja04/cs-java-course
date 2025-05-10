public class Cart
{
  public String cart_item [] = new String [3];
  public double price [] = new double [3];
  public int item_count = 0;
  public double discount;
  public double total_price = 0.0;
  int cart_no;
  
  public void create_cart(int n)
  {
    cart_no = n;
  }
  public void addItem(String s1, double taka)
  {
    if(item_count<3)
    {
      cart_item[item_count] = s1;
      System.out.println(s1+" added to cart "+cart_no);      
      price[item_count]= taka;
      item_count++;
      System.out.println("You have "+item_count+" item(s) in your cart now");
      total_price = total_price + taka;
    }
    else
    {
      System.out.println("You already have "+item_count+" items on your cart ");
    }
  }
    public void addItem( double taka, String s1)
  {
    if(item_count<3)
    {
      cart_item[item_count] = s1;
      System.out.println(s1+" added to cart "+cart_no);      
      price[item_count]= taka;
      item_count++;
      System.out.println("You have "+item_count+" item(s) in your cart now");
      total_price = total_price + taka;
    }
    else
    {
      System.out.println("You already have "+item_count+" items on your cart");
    }
  }
    public void giveDiscount(int n)
    {
      discount =(double) n;
      total_price = total_price -(total_price* (discount/100));
    }
    public void cartDetails()
    {
      System.out.println("Your cart (c"+cart_no+"):");
      for(int i = 0; i < item_count; i++)
      {
        System.out.println(cart_item[i]+" - "+price[i]);
      }
      System.out.println("Discount Applied: "+discount+"%");
      System.out.println("Total price: "+total_price);
    }
    
}