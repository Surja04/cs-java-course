public class Tester_3 {
  
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
  

  public static int Task3_list_vertex(int vertex,Node []a)
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
  public static int Task3_matrix_vertex(int vertex,int [][]a)
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
  public static int Task3_list_degree(int count , Node [] a)
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
  public static int Task3_Matrix_degree(int count , int [][]a)
  {

    for(int i = 0; i < a.length; i++)
    {
      int d = 0;
      for(int j = 0 ; j < a[0].length; j++)
      {
        if (a[i][j] != 0)
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
    

    ListConversion(1, 2, 3, adjList);
    ListConversion(1, 8, 4, adjList);
    ListConversion(2, 3, 6, adjList);
    ListConversion(3, 4, 8, adjList);
    ListConversion(4, 5, 10, adjList);
    ListConversion(5, 6, 11, adjList);
    ListConversion(6, 7, 14, adjList);
    ListConversion(7, 8, 16, adjList);
    ListConversion(8, 1, 18, adjList);
    ListConversion(7, 1, 19, adjList);
    ListConversion(2, 1, 5, adjList);
    ListConversion(3, 2, 7, adjList);
    ListConversion(4, 3, 9, adjList);
    ListConversion(5, 4, 12, adjList);
    ListConversion(6, 5, 13, adjList);
    ListConversion(8, 7, 15, adjList);
    ListConversion(1, 3, 20, adjList);
    
    int[][] adjMat = new int[n + 1][n + 1];

    adding_edge(1, 2, 3, adjMat);
    adding_edge(1, 8, 4, adjMat);
    adding_edge(2, 3, 6, adjMat);
    adding_edge(3, 4, 8, adjMat);
    adding_edge(4, 5, 10, adjMat);
    adding_edge(5, 6, 11, adjMat);
    adding_edge(6, 7, 14, adjMat);
    adding_edge(7, 8, 16, adjMat);
    adding_edge(8, 1, 18, adjMat);
    adding_edge(7, 1, 19, adjMat);
    adding_edge(2, 1, 5, adjMat);
    adding_edge(3, 2, 7, adjMat);
    adding_edge(4, 3, 9, adjMat);
    adding_edge(5, 4, 12, adjMat);
    adding_edge(6, 5, 13, adjMat);
    adding_edge(8, 7, 15, adjMat);

    System.out.println("Vertex with lIST"+Task3_list_vertex(-1,adjList));
    System.out.println("Vertex with MATRIX"+Task3_matrix_vertex(-1,adjMat));
    System.out.println("Degree with lIST"+Task3_list_degree(0,adjList));
    System.out.println("Degree with MATRIX"+Task3_Matrix_degree(0,adjMat));
    
  }
}
