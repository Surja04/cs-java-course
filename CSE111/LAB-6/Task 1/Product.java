public class Product
{
  private String name ;
  private double price ;
  private int quantity;
  
  public Product()
  {
    name = "Unknown";
    price = 0.0;   
  }
  
  public Product(String s,double i)
  {
    name =s;
    price = i;
    
  }
  public double getPrice()
  {
    return price;
  }
  public void setQuantity(int q)
  {
    quantity = q;
  }
  public int getQuantity()
  {
    return quantity;
  }
  public void displayInfo()
  {
    System.out.println("Product Name: "+name);
    System.out.println("Price: "+price); 
  }
  public void displayInfo(boolean t)
  {
    if(t){
    System.out.println("Product Name: "+name);
    System.out.println("Price: "+price); 
    System.out.println("Quantity: "+quantity);
    }
  }
  
} 