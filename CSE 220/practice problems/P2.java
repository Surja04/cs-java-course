public class P2 {
  
  public static Node intersectionList( Node head1,Node head2){
    int length = 0;
    Node c1 = head1;
    Node c2 = head2;
    Node newHead = new Node (null,null);
    Node tail = newHead;
    while (c1 != null)
    {
      c2 = head2;
      while(c2 != null)
      {
        if(c1.elem == c2.elem)
        {
          if(newHead.elem == null)
          {
            newHead.elem = c1.elem;
            tail = newHead;            
            break;
          }
          else
          {
            tail.next = c1;
            tail = tail.next;            
            break;
          }
        }
        else
        {
          c2 = c2.next;
        }
      }
      c1 = c1.next;
    }    
    return newHead;

  }
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{1,2,3,5,4});    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);   
    Node head2 = LinkedList.createList(new Integer[]{8,2,4,9,8,5,6});
    System.out.print("Linked List 2: ");
    LinkedList.printLL(head2);
    Node result = intersectionList(head1,head2);
    LinkedList.printLL(result);
  }
}