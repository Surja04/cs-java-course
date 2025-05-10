class Node{
  
  Object elem;
  Node next;
  
  public Node(Object elem, Node next){
    this.elem = elem;
    this.next = next;
  }
  
  //Overloading
  public Node(Object elem){
    this.elem = elem;
    this.next = null;
  }
  //Postion of nodes
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
  
  
}