public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        

        heap[size] = value;

        swim(size);
        size++;
    }

    private void swim(int index) {
        int parent = (index - 1) / 2;
        

        while (index > 0 && heap[index] > heap[parent]) {

            int temp = heap[index];
            heap[index] = heap[parent];
            heap[parent] = temp;
            
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    public int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1; // or throw exception
        }
        
        int max = heap[0];

        heap[0] = heap[size - 1];
        size--;

        sink(0);
        
        return max;
    }

    private void sink(int index) {
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;  // Changed from smallest to largest
            

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }
            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }
            
            if (largest == index) {
                break;
            }
            

            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            
            index = largest;
        }
    }

    public void sort() {

        for (int i = (size / 2) - 1; i >= 0; i--) {
            sink(i);
        }
        

        for (int i = size - 1; i > 0; i--) {
            // Move current root to end
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            

            size--;
            sink(0);
        }
        

        size = heap.length;
    }


    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the MaxHeap class
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        
        System.out.println("Inserting values: 5, 3, 8, 1, 2");
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        
        System.out.print("Heap after insertions: ");
        heap.printHeap();
        
        System.out.println("Extracted max: " + heap.extractMax());
        System.out.print("Heap after extraction: ");
        heap.printHeap();
        
        System.out.println("Sorting the heap...");
        heap.sort();
        System.out.print("Sorted array: ");
        heap.printHeap();
    }
}