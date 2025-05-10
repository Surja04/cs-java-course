public class Product{
  public static int count;
  public String name;
  public int price;
  public Product(String n, int p){
    name = n;
    price = p;
  }
  public void details(){
    System.out.println("Name: "+name);
    System.out.println("Price: "+price);
  }
}