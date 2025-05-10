/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        int sum = 0;
        int length = key.length();
        for(int i=0; i<length; i++){
            if(length%2 == 0) {
                if(i%2 ==0) {
                    int ascii = key.charAt(i);
                    sum += ascii;
                }

            }
            else
            {
                if(i%2 !=0)
                {
                    int ascii = key.charAt(i);
                    sum += ascii;
                }
            }


        }
        int index = sum % ht.length;
        return index;
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value) {
        int index = hashFunction(key);
        FruitNode n = new FruitNode(key, value);
        if (ht[index] == null) {
            ht[index] = n;
        }
        FruitNode current = ht[index];
        while (current != null) {
            if (current.fruit[0].equals(key)) {
                current.fruit[1] = value;
                return;
            } else {
                current = current.next;
            }
        }


        current = ht[index];
        FruitNode prev = null;

        // Traverse the chain to find the correct position for the new node
        while (current != null && (int) current.fruit[1] >= value) {
            prev = current;
            current = current.next;
        }

        if (prev == null) {

            n.next = ht[index];
            ht[index] = n;
        }
        else {

            n.next = prev.next;
            prev.next = n;
        }
    }

}
