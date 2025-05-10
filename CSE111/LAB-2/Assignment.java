//Design class for Task 6
public class Assignment
{
  public int tasks;
  public String difficulty;
  public boolean submission ;
  //public String ab="Assignment will not require Submission";
  
  public void printDetails()
  { 
    
    System.out.println("Number of tasks: "+tasks);
    System.out.println("Difficulty level: "+difficulty);
    System.out.println("Submission required: "+submission);
//    submission = false;
  }
  public String makeOptional()
  {
    if(!submission)
    {
      return "Submission is already not required";
    }
    else{
      submission = false;      
      return "Assignment will not return Submission"; 
    }
    
    
  }
}