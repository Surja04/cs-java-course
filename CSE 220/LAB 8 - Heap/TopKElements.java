import java.util.Arrays;

public class TopKElements {
    public int[] findTopK(int[] nums, int k) {

        MaxHeap maxHeap = new MaxHeap(nums.length);
        

        for (int i = 0; i < nums.length; i++) {
            maxHeap.insert(nums[i]);
        }
        

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.extractMax();
        }
        
        return result;
    }

    public static void main(String[] args) {
        TopKElements solution = new TopKElements();
        
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        
        int[] result = solution.findTopK(nums, k);
        System.out.println("Top " + k + " elements: " + Arrays.toString(result));
    }
}