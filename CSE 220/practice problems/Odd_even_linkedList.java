public class Odd_even_linkedList {
  
  public static Node mergeOddEven( Node head1){
     Node dummy = new Node(null,head1);
     int length = Node.nodeLength(head1);
     Node last = Node.NodeAt(head1,length-1);
     Node curr = dummy.next;
     Node end = last;
     while(curr != last)
     {
       Node temp = curr.next;
       end.next = temp;
       curr.next = curr.next.next;
       temp.next = null;
       curr = curr.next;
       end = end.next;
     }
     
     
    
//     dummy.next = head1;

     return dummy.next;
  }
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{2,1,3,5,6,4,7});
    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);

    Node result = mergeOddEven(head1);
    LinkedList.printLL(result);
  }
}