class Node {
    Integer elem;
    Node next;

    Node(Integer elem, Node next) {
        this.elem = elem;
        this.next = next;
    }

    static int nodeLength(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    static Node NodeAt(Node head, int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) return null;
            current = current.next;
        }
        return current;
    }
}

class LinkedList {
    static Node createList(Integer[] elements) {
        Node dummy = new Node(null, null);
        Node current = dummy;
        for (Integer elem : elements) {
            current.next = new Node(elem, null);
            current = current.next;
        }
        return dummy.next;
    }

    static void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.elem + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class t1 {

    public static Node reversingSublist(Node head1) {
        Node dummy = new Node(null, head1);
        Node c = head1;
        Node lp = dummy;

        while (c != null) {
            if (c.elem % 2 == 0) {
                Node first = c;
                while (lp.next != first) {
                    lp = lp.next;
                }
                Node last = first;
                while (last.next != null && last.next.elem % 2 == 0) {
                    last = last.next;
                }
                System.out.println(last.elem);
                Node nextNode = last.next;
                Node prev = null;
                Node current = first;
                while (current != nextNode) {
                    Node temp = current.next;
                    current.next = prev;
                    prev = current;
                    current = temp;
                }
                lp.next = prev;
                first.next = nextNode;
                c = nextNode;
            } else {
                lp = c;
                c = c.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{2, 18, 24, 3, 5, 7, 9, 6, 12});

        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);

        Node result = reversingSublist(head1);
        System.out.print("Reversed List: ");
        LinkedList.printLL(result);
    }
}