import java.util.Scanner;

public class WRMTester {
  public static void main(String[] args) {
    System.out.println("** Welcome to Waiting Room Management System **");
    WRM wrm = new WRM(); 
    Scanner input = new Scanner(System.in); 
    
    while (true) {
      
      System.out.println("\nOptions:");
      System.out.println("1. Register Patient");
      System.out.println("2. Serve Patient");
      System.out.println("3. Show All Patients");
      System.out.println("4. Can Doctor Go Home?");
      System.out.println("5. Cancel All Appointments");
      System.out.println("6. Reverse The Line");
      System.out.println("7. Exit");
      System.out.print("Choose an option: ");
      int select = input.nextInt(); 
      
      if (select == 1) {
      
        System.out.print("Enter Patient ID: ");
        int id = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter Patient Name: ");
        String name = input.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter Patient Blood Group: ");
        String bloodGroup = input.nextLine();
        wrm.registerPatient(id, name, age, bloodGroup); // Call registerPatient method
      } 
      else if (select == 2) {                
        wrm.servePatient(); 
      } 
      else if (select == 3) {                
        wrm.showAllPatient(); 
      } 
      else if (select == 4) {
        
        if (wrm.canDoctorGoHome()) 
        {
          System.out.println("Yes, the doctor can go home.");
        } 
        else 
        {
          System.out.println("No, patients are waiting.");
        }
      } 
      else if (select == 5) 
      {                
        wrm.cancelAll(); 
      }
      else if (select == 6) 
      {               
        wrm.reverseTheLine(); 
      }
      else if (select == 7) {
        
        System.out.println("Exiting... Thank you for using the Waiting Room Management System!");
        
        break; 
      }
      else
      {        
        System.out.println("Invalid option. Please try again.");
      }
    }
  }
}
