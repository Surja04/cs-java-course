public class Task2 {

    public static String findPath(BSTNode root, Integer key) {
        Integer arr[] = new Integer[10]; // large enough array
        return function(arr, 0, root, key);
    }

    public static String function(Integer a[], Integer i, BSTNode root, Integer key) {
        if (root == null) {
            return "No Path Found";
        }

        a[i++] = root.elem;

        if (root.elem == key) {

            String result = "";
            for (int j = 0; j < i; j++) {
                result += a[j];
                if (j != i - 1) result += " ";
            }
            return result;
        }
        else if (root.elem > key) {
            return function(a, i, root.left, key);
        }
        else {
            return function(a, i, root.right, key);
        }
    }
}
