public class reverse {
  
  public static Node intersectionList( Node head1){
    Node prev = null;
    Node curr = head1;
    
    while (curr != null)
    {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;    
    }

    head1 = prev;    
    return head1;
  }
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{1,2,3,5,4});
    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);   

    Node result = intersectionList(head1);
    LinkedList.printLL(result);
  }
}