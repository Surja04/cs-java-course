public class reverseAndswap {
  
  public static Node reversingSublist( Node head1,int l, int r){
     Node dummy  = new Node(null,head1);
     Node lp = dummy;
     Node c = head1;
     for(int i = 0; i < l-1; i++)
     {
       lp = c;
       c = c.next;
     }
     Node prev = new Node(null,null);
     Node next = new Node(null,null);
     Node last = Node.NodeAt(head1,r);
     Node current = c;
     int count = 0;
     while(count< r-l+1)
     {
       next = current.next;
       current.next = prev;
       prev = current;
       current = next;
       count++;
     }
      lp.next.next = current;

      lp.next = prev;
      if(r == 6){
        head1=dummy.next;
        return head1;
      }
    
      Node temp = c.next;
//      c.next = null;
      while(temp.next != null)
      {
        temp = temp.next;
      }
      temp.next = dummy.next;
         
       head1 = c.next;
       c.next = null;
      
     
  
    
    return head1;
    
  }
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{5,7,6,3,8,2,1});
    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);
    int left = 0;
    int right = 5;
    
    Node result = reversingSublist(head1,left,right);
    LinkedList.printLL(result);
  }
}