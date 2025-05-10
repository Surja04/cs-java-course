import java.util.Stack;

public class sorting {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] elements = {50, 40, 70, 20, 10, 80,30};
        for (int element : elements) {
            st.push(element);
        }

        int k = 40;
        Stack<Integer> result = filter_and_sort_stack(st, k);

        System.out.print("Filtered and sorted stack: ");
        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }

    public static Stack<Integer> filter_and_sort_stack(Stack<Integer> st, int k) {
        // Step 1: Filter the stack
        Stack<Integer> filteredStack = new Stack<>();
        while (!st.isEmpty()) {
            int temp = st.pop();
            if (temp <= k) {
                filteredStack.push(temp);
                System.out.println(temp);
            }
        }

        // Step 2: Sort the filtered stack
        Stack<Integer> sortedStack = new Stack<>();
        while (!filteredStack.isEmpty()) {
            int temp = filteredStack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                filteredStack.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }

        return sortedStack;
    }
}