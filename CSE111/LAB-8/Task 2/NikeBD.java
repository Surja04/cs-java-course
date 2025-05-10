public class NikeBD
{
  public int count;
  public static int branch_count;
  public static int arr1[] = new int [3];
  public static String arr4[] = {"Jordan", "Cortez","Kobe"};
  
  public String outlet;
  public String arr2[] = {"Jordan", "Cortez","Kobe"};
  public int arr3[] = new int [3];
  public int branch_sold;
  static int total_sold;
  
  public NikeBD(String s)
  {
    outlet = s;
  }
  public void details()
  {
    System.out.println("Nike "+outlet+" outlet:");
    System.out.println("Products Currently Stocked: ");
    for(int i = 0; i < arr1.length; i++)
    {
      if(i == arr1.length-1)
      {
        System.out.println(arr2[i]+": "+arr3[i]);
        
      }
      else{
        System.out.print(arr2[i]+": "+arr3[i]+", ");
      }
    }
    System.out.println("Sold: "+branch_sold);
  }
  public static void status()
  {
    System.out.println("Nike Bangladesh Status:");
    System.out.println("Branches Opened: "+branch_count);
    System.out.println("Currently Stocked: "+branch_count);
    for(int i = 0; i < arr1.length; i++)
    {
      if(i == arr1.length-1)
      {
        System.out.println(arr4[i]+": "+arr1[i]);
        
      }
      else
      {
        System.out.print(arr4[i]+": "+arr1[i]+", ");
      }
    }
    
    
    System.out.println("Sold: "+total_sold);
    
  }
  
  public void restockProducts(String s, int a)
  {
    for(int i = 0; i < arr2.length;i++)
    {
      if(arr2[i].equals(s))
      {
        arr3[i] = arr3[i] + a;
        arr1[i] = arr1[i] + a;
        return;
      }
    }
  }
  public void restockProducts(String p[], int q[])
  {
    for(int i = 0; i < arr1.length; i++)
    {
      if(p[i].equals(arr4[i]))
      {
        arr3[i] = arr3[i]+q[i];
        arr1[i] = arr1[i]+q[i];
      }
    }
  }
  
  public void productSold(String s, int a, String d, int g)
  {
    for(int i = 0; i < arr1.length; i++)
    {
      if(arr4[i].equals(s))
      {
        branch_sold = branch_sold +a;
        total_sold = total_sold + a;
        arr1[i]= arr1[i]-a;
        arr3[i]= arr3[i]-a;
      }
      else if(arr4[i].equals(d))
      {
        branch_sold = branch_sold +g;
        total_sold = total_sold + g;
//        if(arr4[i].equals("Kobe"))
//        {
//          System.out.println("kobe ");
//          arr3[i]=arr3[i]-g;
//        }
        arr1[i]= arr1[i]-g;
        arr3[i]= arr3[i]-g;
      }
    } 
  }
  
  
  
}