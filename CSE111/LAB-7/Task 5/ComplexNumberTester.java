public class ComplexNumberTester {
  public static void main(String[] args) {
//    // Create a ComplexNumber object using the default constructor
    ComplexNumber cn1 = new ComplexNumber();
    System.out.println(cn1);
    System.out.println("----------------");
//    
//    // Create a ComplexNumber object using the parameterized constructor
    ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
    System.out.println(cn2);
  }
}
