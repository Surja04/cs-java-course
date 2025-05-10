// Task05: Alternate Merge
public class P1 {
  
  public static Node lastvalueadd( Node head1){
     int length = 0;
     Node c1 = head1; 
     while(c1 != null)
     {
       length++;
       c1 = c1.next;
     }
//     System.out.println(length);
     int count =0;
     Node c2 = head1;
     while(count < length-2)
     {
       count++;
       c2=c2.next;      
     }
       Node temp = c2.next;
       temp.next = head1;
       head1 = temp;

       c2.next = null;
       Node dummy = new Node (null,null);
       boolean d = false;
//       if(dummy == null)
//       {
////         dummy=true;
//         System.out.println(125);
//       }
     


    return head1;
  }
  
  


//NOTE: if you find any issue with the driver code please inform AIB
//DO NOT TOUCH THE DRIVER CODE BELOW
public static void main(String[] args){
  System.out.println("==============Test Case 1=============");
  Node head1 = LinkedList.createList(new Integer[]{1,2,3,4,5});

  System.out.print("Linked List 1: ");
  LinkedList.printLL(head1);

  Node result = lastvalueadd(head1);
  LinkedList.printLL(result);
  
//  System.out.print( "Your output: ");
//  LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
//  System.out.println();
//  
//  System.out.println("\n==============Test Case 2=============");
//  Node head1 = LinkedList.createList(new Integer[]{3,8,1,5,7,12});  
//  System.out.print("Linked List 1: ");
//  LinkedList.printLL(head1);
//
//  result = lastvalueadd(head1);
//  
//  System.out.print( "Your output: ");
//  LinkedList.printLL(result);
//  System.out.println();
  

}
}
