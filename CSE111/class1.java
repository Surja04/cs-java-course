public class class1{
  public static void main (String [] args){
//    Scanner sc = new Scanner (System.in);
    Student2 s1 = new Student2();
    Student2 s2 = new Student2();
//    System.out.println(s1.name);
    s1.name = "Rakib";
//    System.out.println(s1.name);
    s2.name = "Joy";
    s2.id = 24201215;
    s2.cgpa = 3.5;
    s2.credit = 42;
    s2.dept = "CSE";
//    System.out.println(s1.name);
//    System.out.println(s1.id);
//    System.out.println(s1.cgpa);
//    System.out.println(s1.credit);
//    System.out.println(s1.dept);
//    System.out.println("###########################");
//    System.out.println(s2.name);
//    System.out.println(s2.id);
//    System.out.println(s2.cgpa);
//    System.out.println(s2.credit);
//    System.out.println(s2.dept);
//    System.out.println(s1);
//    System.out.println(s2);
//    s2.name = "Rakib";
//    System.out.println(s1.name==s2.name);
//    System.out.println(s1.name.equals(s2.name));
    s2=s1;
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1.name);
    System.out.println(s2.name);
    Student2 s3=s2;
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}