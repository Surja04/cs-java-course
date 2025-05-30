// Task05: Alternate Merge
public class Task1 {
  
  public static Node alternateMerge( Node head1, Node head2 ){
    Node c1 = head1;
    Node c2 = head2;
    Node temp1 = c1.next;
    Node temp2 = c2.next;
    
    while(c1 != null && c2 != null)
    {
      c1.next = c2;
      c2.next = temp1;
//         System.out.println(c1.elem);
      c1 = temp1;
      c2 = temp2;  
      if(temp1 != null && temp2 != null)
      { 
      temp1 = temp1.next;
      temp2 = temp2.next;
      }
    }
    
//    temp1.next = null;
//    temp2.next = null;
    
    return head1;
  }
  
  


//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
public static void main(String[] args){
  System.out.println("==============Test Case 1=============");
  Node head1 = LinkedList.createList(new Integer[]{1,2,6,8,11});
  Node head2 = LinkedList.createList(new Integer[]{5,7,3,9,4});
  System.out.print("Linked List 1: ");
  LinkedList.printLL(head1);
  System.out.print("Linked List 1: ");
  LinkedList.printLL(head2);
  Node result = alternateMerge(head1, head2);
  System.out.println("\nExpected output: 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4");
  System.out.print( "Your output: ");
  LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
  System.out.println();
  
  System.out.println("\n==============Test Case 2=============");
  head1 = LinkedList.createList(new Integer[]{5,3,2,-4});
  head2 = LinkedList.createList(new Integer[]{-4,-6,1});
  System.out.print("Linked List 1: ");
  LinkedList.printLL(head1);
  System.out.print("Linked List 1: ");
  LinkedList.printLL(head2);
  result = alternateMerge(head1, head2);
  System.out.println("\nExpected output: 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4");
  System.out.print( "Your output: ");
  LinkedList.printLL(result); //This should print 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4
  System.out.println();
  
  System.out.println("\n==============Test Case 3=============");
  head1 = LinkedList.createList(new Integer[]{4,2,-2,-4});
  head2 = LinkedList.createList(new Integer[]{8,6,5,-3});
  System.out.print("Linked List 1: ");
  LinkedList.printLL(head1);
  System.out.print("Linked List 1: ");
  LinkedList.printLL(head2);
  result = alternateMerge(head1, head2);
  System.out.println("\nExpected output: 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3");
  System.out.print( "Your output: ");
  LinkedList.printLL(result); //This should print 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3
  System.out.println();
}
}
