public class ProductTester{
  public static void main(String args[]){
    System.out.println("Total Products: "+Product.count);
    Book b1 = new Book("Harry Potter", 23456859, 350);
    System.out.println("1-------------");
    b1.details();
    System.out.println("2-------------");
    Book b2 = new Book("Hamlet", 37991797, 500);
    b2.details();
    System.out.println("3-------------");
    b1.increasePrice(200);
    System.out.println("4-------------");
    b1.details();
    System.out.println("5-------------");
    System.out.println("Total Products: "+Product.count);
  }
}