public class P10 {
  
  public static Node removeAlternateValue( Node head1,int n){
        int idx = 0;
        Node c = head1;
        c=c.next;
        idx++;//1
        int m = idx-1;

        
        while(c != null)
        {
          
          if(idx%2 != 0)
          {
//            Node prev = Node.NodeAt(head1,m);//0,1
//            System.out.println(prev.elem);
            Node prev = head1;
            while(prev.next.elem != c.elem)
            {
              prev = prev.next;
            }
            Node temp = c.next;
            prev.next = temp;
            c = temp;
            idx++;//2
           
          }
          else
          {
           
            c= c.next;
            idx++;
          }
        }
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

    Node result = removeAlternateValue(head1,2);
    LinkedList.printLL(result);
  }
}