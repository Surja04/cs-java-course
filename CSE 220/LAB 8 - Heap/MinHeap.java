public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
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
        
        while (index > 0 && heap[index] < heap[parent]) {
            int temp = heap[index];
            heap[index] = heap[parent];
            heap[parent] = temp;
            
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        sink(0);
        
        return min;
    }

    private void sink(int index) {
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;
            
            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }
            
            if (smallest == index) {
                break;
            }
            
            int temp = heap[index];
            heap[index] = heap[smallest];
            heap[smallest] = temp;
            
            index = smallest;
        }
    }

    public void sort() {
        for (int i = (size / 2) - 1; i >= 0; i--) {
            sink(i);
        }
        
        for (int i = size - 1; i > 0; i--) {
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

    // Main method to test the MinHeap class
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        
        System.out.println("Inserting values: 5, 3, 8, 1, 2");
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        
        System.out.print("Heap after insertions: ");
        heap.printHeap();
        
        System.out.println("Extracted min: " + heap.extractMin());
        System.out.print("Heap after extraction: ");
        heap.printHeap();
        
        System.out.println("Sorting the heap...");
        heap.sort();
        System.out.print("Sorted array: ");
        heap.printHeap();
    }
}