/*You will have to complete the PairNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and searchHashtable()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the PairNode objects
    private PairNode[] ht;

    //Constructor that initializes the HashTable array
    //DO NOT change this Constructor
    public HashTable(int size) {
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
    //DO NOT change this method
    public void createFromArray(Object[][] arr) {
        for (Object[] x : arr)
            this.insert(x);
    }

    //The insert() method inserts the pair into proper Hashed Index
    //This method is already written including collision resolve using Forward Chaining
    //DO NOT change this method
    public void insert(Object[] keyValuePair) {
        String key = (String) keyValuePair[0];
        Integer value = (Integer) keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if (srchResult == null) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if (srchResult.equals("Found")) {
            System.out.println("(" + key + "," + value + ") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction(key);
            PairNode newPNode = new PairNode(key, value);
            if (this.ht[hashedIndex] == null) {
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void printHashTable() {
        for (int i = 0; i < ht.length; i++) {
            System.out.print(i + " : ");
            PairNode pNode = ht[i];
            if (pNode == null) System.out.println("null");
            while (pNode != null) {
                System.out.print("(Key: " + pNode.key + ", Value: " + pNode.value + ") --> ");
                if (pNode.next == null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

    //you need to COMPLETE this method
    private int hashFunction(String key) {
        int total = 0;
        String consecutive_value = "";
        int index = 0;
        int length = key.length();
        if(length%2 != 0)
        {
            key = key +'N';
        }

            for (int i = 0; i < key.length() - 1; i += 2) {
                int ascii_1 = key.charAt(i);

                int ascii_2 = key.charAt(i + 1);
                consecutive_value = consecutive_value + "" + ascii_1 + "" + ascii_2;
//                consecutive_value = consecutive_value
                total = total + Integer.parseInt(consecutive_value);
                consecutive_value = "";
            }
            index = total % ht.length;


        return index;
    }


    //you need to COMPLETE this method
    //Hint: you may need to use Integer.parseInt() to convert from String to Integer
    public String searchHashtable(Object[] keyValuePair) {
        int index = hashFunction(keyValuePair[0].toString());
        String key = (String) keyValuePair[0];

        PairNode temp = ht[index];
        while (temp != null) {
            if (temp.key == key) {
                return "Found";
            } else {
                temp = temp.next;
            }
        }
        return "Not Found";
    }
}


