// Task01: check_similar
public class test {
  
  //Two heads are being passed onto this method
  //and a String is expected as return
  public static Node reverseList( Node building1){
    Node prev = building1;
    Node curr = prev.next;
    Node next_node = curr.next;
   
    while(curr != null)
    {
      
      curr.next = prev;
      prev = curr;
      curr = next_node;
      Node next_node = curr.next;
      
    }
    building1.next = null;
    building1 = prev;
//    System.out.print(LinkedList.printLL(building1));
    return building1;
    

  }
  
  //NOTE: if you find any issue with the driver code please inform AIB
  //DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    //DO NOT TOUCH THE DRIVER CODE BELOW
    System.out.println("==============Test Case 1=============");
    String[] b1 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
    Node building_1 = LinkedList.createList(b1);
      LinkedList.printLL(building_1);
     building_1 = reverseList(building_1);
    LinkedList.printLL(building_1);
//    System.out.println()
    

   
  }
  
}
