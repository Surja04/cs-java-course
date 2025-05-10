public class Book {
  protected String title, author;
  private double basePrice;
  public Book(String title, String author, double basePrice) {
    this.title = title;
    this.author = author;
    this.basePrice = basePrice;
  }
  public double calculatePrice() {
    return basePrice;
  }
  public void details() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Base Price: $" + basePrice);
  }
  public void updateBasePrice(double price) {
    if (price > 0) basePrice = price;
    else System.out.println("Invalid price!");
  }
  public boolean isMoreExpensiveThan(Book otherBook) {
    return this.calculatePrice() > otherBook.calculatePrice();
  }
}