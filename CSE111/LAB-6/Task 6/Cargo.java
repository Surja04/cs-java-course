public class Cargo
{
 public static double capacity =10.0;
 public static int count = 0;
 public int cargo_id;
 public String content;
 public double weight;
 public boolean isLoaded;
 
 public static double capacity()
 {
   return capacity;
 }
 public Cargo(String c, double w)
 {
   content = c;
   weight = w;
   isLoaded = false;
   count++;
   cargo_id = count;
 }
 public void details()
 {
   System.out.print("Cargo ID: "+cargo_id+", ");
   System.out.print("Contents: "+content+", ");
   System.out.print("Weight: "+weight+", ");
   System.out.println("Loaded: "+isLoaded);
 }
 public void load()
 {
   if(capacity > weight)
   {
   capacity = capacity - weight;
   isLoaded = true;
   System.out.println("Cargo "+cargo_id+  " Loaded for transport");
   }
   else
   {
     System.out.println("Cannot load cargo, exceeds weight capacity.");
   }
 }
 public void unload()
 {
   capacity = capacity + weight;
   isLoaded = false;
   System.out.println("Cargo "+cargo_id+" unloaded");
 }
}