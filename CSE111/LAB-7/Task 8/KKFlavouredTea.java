public class KKFlavouredTea extends KKTea
{
  private static int regular_sale;
  public static KKFlavouredTea t1 ;
  public KKFlavouredTea(String nm,int pr,int bags)
  {
    super(nm,pr);
    super.tea_bags = bags;
    super.weight = super.tea_bags*2;
  }
  public static void updateSoldStatusFlavoured(KKFlavouredTea s)
  {
    t1 = s;
    s.status = true;
    total_sale++;
    regular_sale++;
  }
}