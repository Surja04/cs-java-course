public class Task3 {
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        
      Node prev = head1;
      Node curr1 = head1.next;
      while(curr1!=null)
      {
        Node next = curr1.next;
        curr1.next = prev;
        prev = curr1;
        curr1 = next;
      }
      head1.next = null;
      head1 = prev;
      Node c1 = head1;
      Node c2 = head2;
      Node c3 = head3;
      Node c4 = new Node(null,null);
      Node temp = c4;
      while(c2 != null && c3 != null)
      {
      int sum = (int) c2.elem+(int)c3.elem;    
      if(sum >= 10)
      {
        temp.elem = sum%10;
      }
      else
      {
        temp.elem = sum;
      }
      Node newNode = new Node(null,null);
      temp.next = newNode;
      temp = temp.next;
      c2 = c2.next;
      c3 = c3.next;
      }
      while(c1.next != null){
            c1 = c1.next;
      }
      c1.next = c4;
      
          

        return head1; // Remove this when you're ready to return the new head
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = Task3.idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = Task3.idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
