  import java.util.Scanner;
public class node_swapping {
  
  public static Node nodeSwap( Node head1,int k){

     int length = nodeLength(head1);
     
    
    Node temp1 = NodeAt(head1 , k-1);//first swapping value
    Node s = NodeAt(head1,length-k);//second swapping value
//        Node temp1 = NodeAt(head1 , 0);//first swapping value
//    Node s = NodeAt(head1,length-2);//second swapping value
  

    
    if(temp1 == head1)
    {
      
      Node temp2 =s.next;////next value of the second swapping value
      Node temp3 = NodeAt(head1,length-k-1);//previous value of the second swapping value
      s.next=temp1.next;
      temp1.next = temp2;
      temp3.next = temp1;
      head1 = s;
      
    }
    else
    {
     
    Node temp2 = s.next;//next value of the second swapping value
    Node temp3 = temp1.next;//previous value of the second swapping value
    Node c = NodeAt(head1,k-2);//previous value of the first swapping value;  

    temp1 = c.next;
    c.next = s;    
    s.next = temp3;
    temp3.next = temp1;
    temp1.next = temp2;
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
    public static int nodeLength(Node head)
    {
      int length = 0;
      Node c = head;
      while(c != null)
      {
        length++;
        c=c.next;
      }
      return length;
    }
  
  
  
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println("==============Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{1,2,3,4,5});
    
    System.out.print("Linked List 1: ");
    LinkedList.printLL(head1);
    int k = input.nextInt();
    Node result = nodeSwap(head1,k);
    LinkedList.printLL(result);
  }
}
    