

public class Phy_final {
 public static void main(String[]args){
 
  double t,t1,t2,t3;
  t1=5d;
  t2=56/60d;
  t3=23/3600d;
   
  t=t1+t2+t3;//5.9397hrs;
  double d=1669d;//distance in meter;
   double d1=d/1000d;//distance in kilometers;
  double velocity=d1/t;
  double d2=d/1609d;//distance in miles;
  
  double velocity2=d2/t;
  
  System.out.printf("Your velocity in km/h is %.7f\n",velocity);
  System.out.printf("Your velocity in miles/h is %.7f\n",velocity2);
  
  
 

  
  
  

  
  
  

 

  

  
 
  

 
 }
 
 
 
 
}

