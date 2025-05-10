public class Node {
    int src, des, weight;
    Node next;

    public Node(int src, int des) {
        this.src = src;
        this.des = des;
        this.weight = 1;
        this.next = null;
    }

}
