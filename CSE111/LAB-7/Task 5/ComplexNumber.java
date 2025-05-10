public class ComplexNumber extends RealNumber
{
 public double imaginary_value;
// super.realvalue = 1.0;
 
 public ComplexNumber()
 {
   super(1.0);
   imaginary_value = 1.0;
//   System.out.println("Imaginary part: "+imaginary_value);
 }
 public ComplexNumber(double r, double i)
 {
   super(r);
   imaginary_value = i;
//   System.out.println("Imaginary part: "+imaginary_value);
 }
 
 //Override
 public String toString()
 {
   System.out.println(super.toString());
   System.out.print("ImaginaryPart: "+imaginary_value);
   return "";
 }
}