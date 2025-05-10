public class reverseSublist {
  
  public static Node reversingSublist( Node head1,int left,int right){
     Node dummy = new Node(null,head1);
     
    
//     dummy.next = head1;
     Node leftPrev = dummy;
     Node curr = head1;
     for(int i = 0; i < left-1; i++)
     {
       leftPrev = curr;
       curr = curr.next;
     }
     System.out.println(leftPrev.elem);
     Node prev = null ;    
//     Node next = null;
     
     for(int i = 0; i<right-left+1; i++)
     {
        Node next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
     }

     leftPrev.next.next = curr;
     leftPrev.next = prev;
     return dummy.next;
  }
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{1,2,3,4,5,6});
    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);
    int left = 1;
    int right = 4;

    Node result = reversingSublist(head1,left,right);
    LinkedList.printLL(result);
  }
}