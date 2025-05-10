// Task04: Word Decoder
public class Task2 {
  
  public static Node wordDecoder( Node head ){
    int length =0;
    Node c1 = head;
    while(c1 != null)
    {
      length++;
      c1 = c1.next;          
    }
    c1 = head;
    int count = 0;
    if (length == 0) return null;

    int multi = 13 % length;
    while (count != multi)
    {
      count++;
      c1 = c1.next;      
    }
     Node newhead  = c1;
     Node current = newhead;
     count++;
     c1 = c1.next;
     while(c1 != null)
     {
     if (count % multi == 0) {
        current.next = c1; 
        current = current.next;
      }
      count++;
      c1 = c1.next;
    }
    current.next = null;  
    
    Node prev = newhead;
    Node curr = newhead.next;
    while (curr != null)
    {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    newhead.next=null;      
    newhead = prev;
    Node dummy = new Node(null, null);  
    dummy.next = newhead;
    return dummy;
   
    
   
  } 
  
//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
  public static void main(String[] args){
    System.out.println("==============Test Case 1=============");
    Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
    System.out.print("Encoded Word: ");
    LinkedList.printLL(head);
    System.out.println("\nExpected output: null -> C -> A -> T");
    Node result = wordDecoder(head);
    System.out.println( "Your output: ");
    LinkedList.printLL(result); //This should print null -> C -> A -> T
    System.out.println();
    System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
    System.out.println();
  }
}
