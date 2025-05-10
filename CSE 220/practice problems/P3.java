public class P3 {
  
  public static Node reversingSublist( Node head1){
    Node dummy = new Node(null,head1);
    Node c = head1;
    Node lp = dummy;
    int length = Node.nodeLength(head1);
    
    while(c != null){
      if((int)c.elem%2 == 0){
        Node start = c;
        while(lp.next != start)
        {
          lp = lp.next;
          
        }
        Node last = start;
        while (last.next != null && (int) last.next.elem % 2 == 0) {
          last = last.next;
        }
        Node prev = null;
        Node next = null;
        Node nextNode = last.next;
        Node current = start;
        while(current != nextNode)
        {
                     next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
        }
    lp.next = prev;
                current.next = nextNode;
                c = nextNode;

        
        

        
        
      }
      else
      {
        
        
        lp = c;
        c = c.next;
        
      }
      
    }
    return head1;
  }
  
  
  
  
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{2,18,24,3,5,7,9,6,12});
    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);
//    int left = 1;
//    int right = 4;
    
    Node result = reversingSublist(head1);
    LinkedList.printLL(result);
  }
}