public class Cat extends Animal
{
  public String breed;
  public Cat(String nm, int a, String clr, String br)
  {
    super(nm,a,clr);
    breed = br;
//    System.out.println("Breed:"+breed);
  }
    public String info()
  {
    System.out.print(super.info());
    String a = ("Breed: "+breed);
    return a;
  }
  public void makeSound()
  {
     System.out.println(color+" color "+name+" is "+" meowing ");
  }
}