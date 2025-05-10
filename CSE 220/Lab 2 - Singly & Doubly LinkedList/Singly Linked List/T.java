//public class T {   
//  public static Node wordDecoder( Node head ){
//    int length =0;
//    Node c1 = head;
//    while(c1 != null)
//    {
//      length++;
//      c1 = c1.next;          
//    }
//    Node first = head;
//    Node second = head.next;
//    
//    int multi = 13 % length;
//    for(int i=0; i<length; i++)
//    {
//      for(int c=0; c<multi-1; c++)
//      {            
//        if(second == null) break;
//        second = second.next;
//      }
//      
//      Node temp = second;
//      second.next = first;
//      first = temp;
//      
//      if(first == null) break;
//      System.out.println(second.elem);
//      
//    }
//    
//    
//    
//    return second;