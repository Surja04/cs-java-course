public class LibraryTester {
  public static void main(String[] args) {
    EBook ebook1 = new EBook("Digital Fortress", "Dan Brown",10.0,
                             "PDF", 5.0);
    EBook ebook2 = new EBook("The Alchemist", "Paulo Coelho",15.0,
                             "EPUB", 3.0);
    Book book = new Book("To Kill a Mockingbird", "Harper Lee",12.0);
    System.out.println("1================");
    ebook1.details();
    System.out.println("2================");
    ebook2.details();
    System.out.println("3================");
    book.details();
    System.out.println("4================");
    System.out.println("Is 'Digital' > 'Alchemist'? "+
                       ebook1.isMoreExpensiveThan(ebook2));
    System.out.println("Is 'Mockingbird' > 'Digital'? "+
                       book.isMoreExpensiveThan(ebook1));
//    System.out.println("5================");
//    ebook1.updateBasePrice(12.0);
//    ebook1.updateFormat("MOBI");
//    ebook1.details();
//    System.out.println("6================");
//    ebook1.recordDownload();
//    ebook1.recordDownload();
//    ebook2.recordDownload();
//    System.out.println("'Digital' > 'Alchemist'? "+
//                       ebook1.hasMoreDownloadsThan(ebook2));
//    System.out.println("7================");
//    System.out.println("Total EBooks: " + EBook.getTotalEBooks());
  }
}