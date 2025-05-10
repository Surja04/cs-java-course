public class Tester_4 {
  
  public static void ListConversion(int src, int des,int weight, Node[] adjList) {
    
    Node edge = new Node(src, des, weight);
    
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
  
  public static void printList(Node[] adjList) {
    for (int i = 0; i < adjList.length; i++) {
      Node temp = adjList[i];
      System.out.print(i + ": ");
      while (temp != null) {
        System.out.print(temp.des + "->");
        temp = temp.next;
      }
      System.out.println();
    }
  }
  
  static void addEdgeToMatrix(int src, int des,int weight, int[][] adjMat) {
    adjMat[src][des] = weight;
  }
  
  static void printMatrix(int[][] adjMat) {
    for (int i = 0; i < adjMat.length; i++) {
      for (int j = 0; j < adjMat[0].length; j++) {
        System.out.print(adjMat[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static int[][] direct_to_undirect_matrix(int[][] adjMat) {
    int n = adjMat.length;
    int[][] u = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (adjMat[i][j] != 0) {
                u[i][j] = adjMat[i][j];
                u[j][i] = adjMat[i][j]; 
            }
        }
    }
    return u;
}
  
public static Node[] direct_to_undirect_list(Node[] adjList) {
    int n = adjList.length;
    Node[] u = new Node[n];

    for (int i = 0; i < n; i++) {
        Node temp = adjList[i];
        while (temp != null) {
          
            Node forward = new Node(i, temp.des, temp.weight);
            if (u[i] == null) {
                u[i] = forward;
            }
            else {
                Node t = u[i];
                while (t.next != null) t = t.next;
                t.next = forward;
            }

            
            Node reverse = new Node(temp.des, i, temp.weight);
            if (u[temp.des] == null) {
                u[temp.des] = reverse;
            } else {
                Node t = u[temp.des];
                while (t.next != null) t = t.next;
                t.next = reverse;
            }

            temp = temp.next;
        }
    }

    return u;
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

    addEdgeToMatrix(1, 2, 3, adjMat);
    addEdgeToMatrix(1, 8, 4, adjMat);
    addEdgeToMatrix(2, 3, 6, adjMat);
    addEdgeToMatrix(3, 4, 8, adjMat);
    addEdgeToMatrix(4, 5, 10, adjMat);
    addEdgeToMatrix(5, 6, 11, adjMat);
    addEdgeToMatrix(6, 7, 14, adjMat);
    addEdgeToMatrix(7, 8, 16, adjMat);
    addEdgeToMatrix(8, 1, 18, adjMat);
    addEdgeToMatrix(7, 1, 19, adjMat);
    addEdgeToMatrix(2, 1, 5, adjMat);
    addEdgeToMatrix(3, 2, 7, adjMat);
    addEdgeToMatrix(4, 3, 9, adjMat);
    addEdgeToMatrix(5, 4, 12, adjMat);
    addEdgeToMatrix(6, 5, 13, adjMat);
    addEdgeToMatrix(8, 7, 15, adjMat);
    int[][] uMat = direct_to_undirect_matrix(adjMat);
    System.out.println("Task 4 with Matrix:");
    printMatrix(uMat);
    System.out.println("Task 4 with List:");
    Node[] uList = direct_to_undirect_list(adjList);
    printList(uList);


    
  }
}
