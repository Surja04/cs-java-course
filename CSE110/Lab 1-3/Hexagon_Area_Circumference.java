import java.lang.Math;
public class Hexagon_Area_Circumference {
    public static void main(String[]args){
        double a=8,b=3;
        double c;
        c=a/2;
        
        double length;
        length=Math.sqrt(c*c+b*b);
        
        double area;
        area=(3*Math.sqrt(3)/3)*(length*length);
        
        double circumference1;
        circumference1=6*length;
        int circumference2=(int) circumference1;
        
        System.out.println("The Area Is:"+area);
        System.out.println("The Circumference Is:"+circumference2);
        
        
        
        
      
        
        
  
 }
 

 
}
