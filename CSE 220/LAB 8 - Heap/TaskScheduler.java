import java.util.Arrays;

public class TaskScheduler {
    public int[] scheduleTasks(int[] tasks, int m) {
        // Create min-heap using your existing MinHeap class
        MinHeap machineLoads = new MinHeap(m);
        

        for (int i = 0; i < m; i++) {
            machineLoads.insert(0);
        }
        
        // Assign each task to the least loaded machine
        for (int i = 0; i < tasks.length; i++) {
            int currentLoad = machineLoads.extractMin();
            machineLoads.insert(currentLoad + tasks[i]);
        }
        
        // Get final machine loads
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = machineLoads.extractMin();
        }
        
        return result;
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;
        
        int[] result = scheduler.scheduleTasks(tasks, m);
        System.out.println("Machine loads: " + Arrays.toString(result));
    }
}