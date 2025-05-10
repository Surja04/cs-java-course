public class Product{
  public static int count;
  private String name;
  public int price;
  public Product(String n, int p){
    name = n;
    price = p;
    Product.count++;
  }
  public void details(){
    System.out.println("Name: "+name);
    System.out.println("Price: "+price);
  }
//  
//  public String getName() {
//    return this.name;
//  }
}