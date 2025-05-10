public class HashTable {

    private PairNode[] ht;

    public HashTable(int size) {
        this.ht = new PairNode[size];
    }

    public void createFromArray(Object[][] arr) {
        for (Object[] x : arr)
            this.insert(x);
    }

    public void insert(Object[] keyValuePair) {
        Integer key = (Integer) keyValuePair[0];
        String value = (String) keyValuePair[1];

        int idx = hashFunction(key);
        if (idx == -1) {
            // leaving it blank
        } else if (ht[idx] == null) {
            ht[idx] = new PairNode(key, value);
        } else {
            PairNode pair = new PairNode(key, value);
            pair.next = ht[idx];
            ht[idx] = pair;
        }
    }

    public void printHashTable() {
        for (int i = 0; i < ht.length; i++) {
            System.out.print(i + ": ");
            PairNode pNode = ht[i];
            if (pNode == null) System.out.println("null");
            while (pNode != null) {
                System.out.print("(" + pNode.key + ", '" + pNode.value + "') --> ");
                if (pNode.next == null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

    private int hashFunction(Integer key) {
        return (key + 3) % ht.length;
    }

    public void remove(Integer key) {
        int idx = hashFunction(key);
        PairNode current = ht[idx];
        PairNode prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    // Remove the head of the chain
                    ht[idx] = current.next;
                }
                else {
                    // Remove a node in the middle or at the end
                    prev.next = current.next;
                }
                return;

            }
            prev = current;
            current = current.next;
        }
    }
}


