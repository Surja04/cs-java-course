public class tester
{
  public static void main(String[]args)
  {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    s1.name = "BOB";
    s1.id = "10";
    s1.subject = "CSE";
    s2.name = "JACK";
    s2.id = "11";
    s2.subject = "BBA";
       
    s3.name = "Surja";
    s3.id = "12";
    s3.subject = "IRONY";
//    System.out.println(s1.name);
//    System.out.println(s1.id);
//    System.out.println(s1.subject);
//    System.out.println(s2.name);
//    System.out.println(s2.id);
//    System.out.println(s2.subject);
    s1 = s3;
    s2 = s1; 
//    s3 = s2;
    
    System.out.println("##########");
    System.out.println(s1.name);
    System.out.println(s1.id);
    System.out.println(s1.subject);
    System.out.println(s2.name);
    System.out.println(s2.id);
    System.out.println(s2.subject); 
    System.out.println(s3.name);
    System.out.println(s3.id);
    System.out.println(s3.subject); 
  }
}