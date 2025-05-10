public class Task5 {
  public static int sumDist(Node head, Integer[] distArr) {
    int length = 0;
    Node temp = head;
    while(temp != null)
    {
      length++;
      temp = temp.next;
    }
//    System.out.println(length);
    int sum = 0;
    for(int i = 0; i < distArr.length; i++)
    {
      
      int current_index = 0;
      int targeted_index = distArr[i];
      Node current = head;
//      System.out.println(current.elem);
      
      while(current != null)
      {
        if(targeted_index >= 0 && targeted_index <length )
        {
          if(current_index == targeted_index)
          {
            sum = sum + (int)current.elem;
//            System.out.println(sum);
           break;
          }
          else
          {
            current_index++;
            current = current.next;
//          sum = sum + 0;
          }
          
        }
        else
        {
          sum = sum +0;
          break;
        }

      }
      
    }
    return sum; // Remove this line.
  }
  
  public static void main(String[] args) {
    System.out.println("=========Test Case 1=============");
    Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
    Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
    System.out.print("Given LinkedList: ");
    LinkedList.printLL(head1);
    System.out.print("Distance Array: ");
    Arr.print(dist);
    System.out.println("\nExpected Output: 4");
    int returnedValue = Task5.sumDist(head1, dist);
    System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
  }
}
