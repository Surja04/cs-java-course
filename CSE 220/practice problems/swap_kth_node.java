public class swap_kth_node {
  
  public static Node swapKthNode( Node head1,int k){
         int length = Node.nodeLength(head1);
         Node dummy = new Node(null,head1);
         Node prev = dummy;
         Node start = Node.NodeAt(head1,k-1);
         Node last = Node.NodeAt(head1,length-k); 
          Node last_previous = Node.NodeAt(head1,length-k-1); 
         while(prev.next.elem != start.elem)
         {
           prev = prev.next;
         }
         Node temp1 = prev.next;
         prev.next = last;
         Node temp2 = last.next;
         last.next = start.next;
         start.next = temp2;
         last_previous.next = start;
         head1 = dummy.next;
         
         
        return head1;
  }
    public static Node NodeAt(Node head, int index)
  {
    int current_index = 0;
    Node c = head;
    while(current_index < index)
    {
      c = c.next;
      current_index++;
    }
    return c;
  }
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{1,2,3,4,5,6});
    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);
    int k =1;

    Node result = swapKthNode(head1,k);
    LinkedList.printLL(result);
  }
}