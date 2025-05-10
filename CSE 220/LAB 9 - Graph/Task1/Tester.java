public class Tester {
  
  public static void ListConversion(int src, int des, Node[] adjList) {
    
    Node edge = new Node(src, des);
    
    if (adjList[src] == null) {
      adjList[src] = edge;
    }
    
    else {
      Node temp = adjList[src];
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = edge;
    }
  }
  

  
  static void adding_edge(int src, int des, int[][] adjMat) {
    adjMat[src][des] = 1;
  }
  

  public static int Task1_list(int count , Node [] a)
  {
    
    for(int i = 0; i < a.length; i++)
    {
      int degree = 0 ;
      Node temp = a[i];
      while(temp != null)
      { 
        degree++;
        temp = temp.next;
      }
      if(degree>count)
      {
        count = degree;
      }
    }
    return count;
  }
    public static int Task1_Matrix(int count , int [][]a)
  {
    
    for(int i = 0; i < a.length; i++)
    {
      int d = 0;
      for(int j = 0 ; j < a[0].length; j++)
      {
        if(a[i][j] == 1)
        {
          d++;
        }
      }
      if(d > count)
      { 
        count = d;
      }
      
    }

    return count;
    
  }
 
  
  public static void main(String[] args) {
    int n = 8;
    Node[] adjList = new Node[n + 1];
    ListConversion(1, 2, adjList);
    ListConversion(1, 8, adjList);
    ListConversion(2, 1, adjList);
    ListConversion(2, 3, adjList);
    ListConversion(3, 2, adjList);
    ListConversion(3, 4, adjList);
    ListConversion(4, 3, adjList);
    ListConversion(4, 5, adjList);
    ListConversion(5, 6, adjList);
    ListConversion(5, 4, adjList);
    ListConversion(6, 5, adjList);
    ListConversion(6, 7, adjList);
    ListConversion(7, 6, adjList);
    ListConversion(7, 8, adjList);
    ListConversion(8, 7, adjList);
    ListConversion(8, 1, adjList);
    ListConversion(7, 1, adjList);
    
//        printList(adjList);
    
    int[][] adjMat = new int[n + 1][n + 1];
    adding_edge(1,2,adjMat);
    adding_edge(1,8,adjMat);
    adding_edge(2,1,adjMat);
    adding_edge(2,3,adjMat);
    adding_edge(3,2,adjMat);
    adding_edge(3,4,adjMat);
    adding_edge(4,3,adjMat);
    adding_edge(4,5,adjMat);
    adding_edge(5,6,adjMat);
    adding_edge(5,4,adjMat);
    adding_edge(6,5,adjMat);
    adding_edge(6,7,adjMat);
    adding_edge(7,6,adjMat);
    adding_edge(7,8,adjMat);
    adding_edge(8,7,adjMat);
    adding_edge(8,1,adjMat);
    adding_edge(7,1,adjMat);
//        printMatrix(adjMat);
    System.out.println("MAX DEGREE USING LIST: " +Task1_list(0,adjList));
    System.out.println("MAX DEGREE USING MATRIX:"+Task1_Matrix(0,adjMat));
    System.out.println("Task 1 ENDS HERE");
    System.out.println("===============================");
    
    
    
    
  }
}
