// Task03: Assemble Conga Line
public class Task4 {
  
  public static Boolean assembleCongaLine(Node head){
    
    Node current = head;
    boolean is_conga = true;
//        System.out.println(current.elem);
//        System.out.println(current.next.elem);
    
    while(current != null)
    {
      if(current.next == null)
      {
        return is_conga;
      }
      {
        if((int)current.elem <(int)current.next.elem)
        {
          current = current.next;
        }
        else
        {
          is_conga = false;
          break;
        }
      }
    }

    return is_conga;
  }
  
  //NOTE: if you find any issue with the driver code please inform AIB
  //DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    
    System.out.println("==============Test Case 1=============");
    Node congaLine = LinkedList.createList(new Integer[]{10,15,34,41,56,72});
    System.out.print("Original Conga Line: ");
    LinkedList.printLL(congaLine);
    System.out.println("Expected output: true");
    System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print True
    System.out.println();
    System.out.println("==============Test Case 2=============");
    congaLine = LinkedList.createList(new Integer[]{10,15,44,41,56,72});
    System.out.print("Original Conga Line: ");
    LinkedList.printLL(congaLine);
    System.out.println("Expected output: false");
    System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print False
    System.out.println();
  }
}
