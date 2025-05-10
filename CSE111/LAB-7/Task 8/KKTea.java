public class KKTea extends Tea
{
  public int tea_bags;
  public static KKTea  t ;
  public int weight;
  public static int total_sale;
  private static int regular_sale;
  
  public KKTea(int pr,int bags )
  {
    super("KK Regular Tea",pr);
    tea_bags = bags;
    weight = tea_bags*2;
  }
    public KKTea(String name,int price )
  {
    super(name,price);
//    tea_bags = bags;
//    weight = tea_bags*2;
  }
  public void  productDetail()
  {
    super. productDetail();
    System.out.print("Weight "+weight+" ");
    System.out.println("Tea Bags: "+tea_bags);    
  }
  public static void totalSales()
  {
    System.out.println("Totals Sales: "+total_sale);
     System.out.println("Regular Sales: "+regular_sale);
    
  }
  public void regularSales()
  {
   
  }
  public static void updateSoldStatusRegular(KKTea a)
  {
        t = a;
        t.status=true;
        total_sale++;
        regular_sale++;
        
  }
  public void updateRegularSales()
  {
    regular_sale++;
  }
  
}