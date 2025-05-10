public class WRM {
    Patient dh;

    
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    
    public void registerPatient(int id, String name, int age, String bloodgroup) {
       
        Patient newPatient = new Patient(id, name, age, bloodgroup, null, null);

        
        Patient temp = dh.prev;
        temp.next = newPatient;
        newPatient.prev = temp;
        newPatient.next = dh;
        dh.prev = newPatient;

        System.out.println("The patient has been successfully registered");
    }

  
    public void servePatient() {
        if (dh.next == dh) {
            System.out.println("No patients to serve.");
            return;
        }       
        Patient current_patient = dh.next;
        System.out.println("Serving Patient: " + current_patient.name);        
        dh.next = current_patient.next;
        current_patient.next.prev = dh;
    }
    
    public void showAllPatient() {
        if (dh.next == dh) {
            System.out.println("NO patients available right now");
            return;
        }     
        Patient current = dh.next;
        System.out.println("Patients are currently in the waiting queue:");
        while (current != dh) {
            System.out.println("ID: " + current.id + ", Name: " + current.name);
            current = current.next;
        }
    }

    
    public boolean canDoctorGoHome() {
      if(dh.next == dh){
        return true; 
      }
      else
      {
        return false;
      }
    }

    
    public void cancelAll() {
        
        dh.next = dh;
        dh.prev = dh;
        System.out.println("Success: All appointments canceled.");
    }

   
    public void reverseTheLine() {
        if (dh.next == dh) {
            System.out.println("No patients to reverse.");
            return;
        }

      
        Patient current = dh.next;
        Patient temp = null;

        while (current != dh) {
            
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;            
            current = current.prev;
        }
      
        if (temp != null)
        {
            dh.next = temp.prev;
        }

        System.out.println("Success: Patient line reversed.");
    }
}