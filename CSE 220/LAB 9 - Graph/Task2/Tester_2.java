public class Tester_2 {
  
  public static void ListConversion(int src, int des,int wt, Node[] adjList) {
    
    Node edge = new Node(src, des, wt);
    
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
  

  
  static void adding_edge(int src, int des,int wt, int[][] adjMat) {
    adjMat[src][des] = wt;
  }
  

  public static int Task2_list(int vertex,Node []a)
  {
    int max_val = 0;
    for(int i = 0; i < a.length; i++ )
    {
      int sum = 0;
      Node temp = a[i];
      while(temp != null)
      {
        sum = sum + temp.wt;
        temp = temp.next;
      }
      if(sum > max_val)
      { 
        max_val = sum;
        vertex = i;
      }
    }
    return vertex;
  }
    public static int Task2_matrix(int vertex,int [][]a)
  {
    int max_val = 0;
    for(int i = 0; i < a.length; i++ )
    {
      int sum = 0;
      for(int j = 0; j < a[0].length;j++){
        sum = sum + a[i][j];
      }

      if(sum > max_val)
      { 
        max_val = sum;
        vertex = i;
      }
    }
    return vertex;
  }

  
  public static void main(String[] args) {
    int n = 8;
    Node[] adjList = new Node[n + 1];
    ListConversion(1, 2,3, adjList);
    ListConversion(1, 8,4, adjList);
    ListConversion(2, 1,5, adjList);
    ListConversion(2, 3,6, adjList);
    ListConversion(3, 2,7, adjList);
    ListConversion(3, 4,8, adjList);
    ListConversion(4, 3,9, adjList);
    ListConversion(4, 5,10, adjList);
    ListConversion(5, 6,11, adjList);
    ListConversion(5, 4,12, adjList);
    ListConversion(6, 5,13, adjList);
    ListConversion(6, 7,14, adjList);
    ListConversion(7, 6,15, adjList);
    ListConversion(7, 8,16, adjList);
    ListConversion(8, 7,17, adjList);
    ListConversion(8, 1,18, adjList);
    ListConversion(7, 1,19, adjList);
    
//        printList(adjList);
    
    int[][] adjMat = new int[n + 1][n + 1];
    adding_edge(1,2,3,adjMat);
    adding_edge(1,8,4,adjMat);
    adding_edge(2,1,5,adjMat);
    adding_edge(2,3,6,adjMat);
    adding_edge(3,2,7,adjMat);
    adding_edge(3,4,8,adjMat);
    adding_edge(4,3,9,adjMat);
    adding_edge(4,5,10,adjMat);
    adding_edge(5,6,11,adjMat);
    adding_edge(5,4,12,adjMat);
    adding_edge(6,5,13,adjMat);
    adding_edge(6,7,14,adjMat);
    adding_edge(7,6,15,adjMat);
    adding_edge(7,8,16,adjMat);
    adding_edge(8,7,17,adjMat);
    adding_edge(8,1,18,adjMat);
    adding_edge(7,1,19,adjMat);
//        printMatrix(adjMat);
    System.out.println("Task 2 With LIST:"+Task2_list(-1,adjList));
    System.out.println("Task 2 With MATRIX:"+Task2_matrix(-1,adjMat));

    
    
    
    
  }
}
