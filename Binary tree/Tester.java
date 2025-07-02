import static java.lang.Math.max;
import static java.lang.Math.min;

public class Tester {

    public static BTNode tree_construction(Object[] arr, int i) {
        if (i >= arr.length || arr[i] == null) {
            return null;
        } else {
            BTNode p = new BTNode(arr[i]);
            p.left = tree_construction(arr, 2 * i);
            p.right = tree_construction(arr, 2 * i + 1);
            return p;
        }
    }

    public static int getHeight(BTNode node) {
        if (node == null) {
            return -1;
        }
        return 1 + max(getHeight(node.left), getHeight(node.right));
    }

    // Task 06
    public static String build_key(BTNode new_root) {
        String w = helper(new_root, 0);
        return w;
    }

    public static String helper(BTNode node, int level) {
        if (node == null) {
            return "";
        }
        if (node.left == null && node.right == null && level % 2 == 0) {
            return node.elem.toString();
        }
        String right = helper(node.right, level + 1);
        String left = helper(node.left, level + 1);
        return right + left;
    }

    // public static String helper(BTNode node, int level,String key)
    // {
    //     if(node == null)
    //     {
    //         return "";
    //     }
    //     if (node.left == null && node.right == null && level % 2 == 0) {
    //         return node.elem.toString();
    //     }
    //     key = helper(node.right, level + 1,key)+helper(node.left, level + 1,key);
    //     return key;
    // }
    public static int left_energy_signature(BTNode node,int sum)
    {
        if(node == null)
        {
            return 0;
        }
        if( node.right == null && node.left != null )
        {

            return (int)node.elem;
        }
        return sum + left_energy_signature( node.left, sum)+ left_energy_signature( node.right, sum);
    }
    public static int right_energy_signature(BTNode node,int sum)
    {
        if(node == null)
        {
            return 0;
        }
        if( node.left == null && node.right != null )
        {

            return (int)node.elem;
        }
        return sum + right_energy_signature( node.left, sum)+ right_energy_signature( node.right, sum);
    }
    public static boolean Same_tree(BTNode node1,BTNode node2)
    {

        if(node1 == null && node2 == null)
        {
            return true;
        }

        if(node1.elem != node2.elem)
        {
            return false;
        }
        return Same_tree(node1.left, node2.left) && Same_tree(node1.right, node2.right);
    }
    public static boolean is_symmetric(BTNode node1)
    {
        boolean is_symm = helper1(node1.left,node1.right,1);
        return is_symm;


    }
    public static boolean helper1(BTNode n1, BTNode n2,int lvl)
    {
        if(n1 == null && n2 == null)
        {
            return true;
        }
        if(n1 == null || n2 == null)
        {
            return false;
        }
        if(n1.elem != n2.elem)
        {
            return false;
        }
        return helper1(n1.left,n2.right,lvl+1) && helper1(n1.right,n2.left,lvl+1);
    }
    public static void equivalent(BTNode n1, BTNode n2,int k)
    {
        if(n1 == null && n2 == null)
        {
            return ;
        }
        if(n1 == null || n2 == null)
        {
            return;
        }




        if(n1.elem == n2.elem)
        {
            if((int)n1.elem%k == 0)
            {
                n1.elem = 100;

            }

        }
        else
        {
            n1.elem  = (int) n1.elem+(int) n2.elem;
        }
        equivalent(n1.left,n2.left,k);
        equivalent(n1.right,n2.right,k);
    }
    public static int max_path_sum(BTNode root)
    {
        int sum1 = helper10(root.left,0);
        int sum2 = helper10(root.right,0);
        return (int)root.elem+max(sum1,sum2);
    }
    public static int helper10(BTNode node, int sum)
    {
        if(node == null)
        {
            return 0;
        }
        int left = helper10(node.left,sum);
        int right = helper10(node.right,sum);
        return (int)node.elem + max(left,right);
    }
    public static int min_path_sum(BTNode root)
    {
        int sum1 = helper11(root.left,0);
        int sum2 = helper11(root.right,0);
        return (int)root.elem+min(sum1,sum2);
    }
    public static int helper11(BTNode node, int sum)
    {
        if(node == null)
        {
            return 0;
        }
        int left = helper11(node.left,sum);
        int right = helper11(node.right,sum);
        return (int)node.elem + min(left,right);
    }
    public static void OddSwap(BTNode root, int lvl)
    {
        if(root == null)
        {
            return ;
        }
        if(root.left == null && root.right == null)
        {
            return;
        }
        if(root.left == null || root.right == null)
        {
            return;
        }
        if(root.left != null && root.right != null){
            if((int)root.left.elem < (int)root.right.elem && lvl%2 != 0)
            {
                int temp =(int) root.left.elem;
                root.left.elem = root.right.elem;
                root.right.elem = temp;
            }
        }
        OddSwap(root.left,lvl+1);
        OddSwap(root.right,lvl+1);

    }
    public static void EvenSwap(BTNode root, int lvl)
    {
        if(root == null)
        {
            return ;
        }
        if(root.left == null && root.right == null)
        {
            return;
        }
        if(root.left == null || root.right == null)
        {
            return;
        }
        if(root.left != null && root.right != null){
            if((int)root.left.elem < (int)root.right.elem && lvl%2 == 0)
            {
                int temp =(int) root.left.elem;
                root.left.elem = root.right.elem;
                root.right.elem = temp;
            }
        }
        EvenSwap(root.left,lvl+1);
        EvenSwap(root.right,lvl+1);

    }
    public static int SumTree(BTNode root,int sum)
    {
        int left = oddsum(root.left,0);
        int right = evensum (root.right,0);
        if(right>left)
        {
            return right-left;
        }
        return left-right;

    }
    public static int oddsum(BTNode node, int sum)
    {
        if (node == null)
        {
            return 0;
        }
        if((int)node.elem%2 != 0)
        {
            sum += (int)node.elem;
        }
        oddsum(node.left,sum);
        oddsum(node.right,sum);
        return sum;
    }
    public static int evensum(BTNode node, int sum)
    {
        if (node == null)
        {
            return 0;
        }
        if((int)node.elem%2 == 0)
        {
            sum += (int)node.elem;
        }
        oddsum(node.left,sum);
        oddsum(node.right,sum);
        return sum;
    }




    public static void main(String[] args) {
        // Manually linking Binary Tree nodes
        // BTNode root = new BTNode("A");
        // BTNode n1 = new BTNode("B");
        // BTNode n2 = new BTNode("C");
        // BTNode n3 = new BTNode("D");
        // BTNode n4 = new BTNode("E");
        // BTNode n5 = new BTNode("F");
        // BTNode n6 = new BTNode("G");

        // root.left = n1;
        // root.right = n2;

        // n1.left = n3;
        // n1.right = n4;

        // n2.left = n5;
        // n2.right = n6;

        Object[] arr = { null, "A", "B", "C", "D", "E", "F", "G" };
        BTNode newRoot = tree_construction(arr, 1);
        System.out.print("The inorder sequence is: ");
        BTPrinter.inorder(newRoot);
        System.out.println();

        // Preorder Traversal of Binary Tree
        System.out.print("The preorder sequence is: ");
        BTPrinter.preorder(newRoot);
        System.out.println();

        // // Inorder Traversal of Binary Tree
        // System.out.print("The inorder sequence is: ");
        // BTPrinter.inorder(newRoot);
        // System.out.println();

        // Postorder Traversal of Binary Tree
        System.out.print("The postorder sequence is: ");
        BTPrinter.postorder(newRoot);
        System.out.println();

        int result = getHeight(newRoot);
        System.out.println("The height of the tree is: " + result);

        Object[] arr1 = { null, "U", "V", "W", "X", "Y", "Z", "I", "J", "N", null, null, "L", "M", null, null, "K" };
        BTNode new_root = tree_construction(arr1, 1);
        System.out.print("The inorder sequence is: ");
        BTPrinter.inorder(new_root);
        System.out.println();

        String key = build_key(new_root);
        System.out.println("The key is: " + key);

        Object[] array = { null, 5, 7, 9, 3, null, 2, 6, null, null, null, null,null,null, 5,null };
        System.out.print("The inorder sequence is: ");
        BTNode root1 = tree_construction(array, 1);
        BTPrinter.inorder(root1);
        System.out.println();
        int result1 = left_energy_signature(root1,0);
        System.out.println("The left energy signature is: " + result1);

        Object[] array2 = { null,5,7,9,3,2,null,6,null,null,null,5 ,null,null,null,null};
        System.out.print("The inorder sequence is: ");
        BTNode root2 = tree_construction(array2, 1);
        BTPrinter.inorder(root2);
        System.out.println();
        int result2 = right_energy_signature(root2,0);
        System.out.println("The right energy signature is: " + result2);

        Object[] a1 = { null, 1, 2, 3, 4, 5 };
        Object[] a2 = { null, 1, 2, 3, 4, 5 };
        BTNode root3 = tree_construction(a1, 1);
        BTNode root4 = tree_construction(a2, 1);
        Boolean is_same = Same_tree(root3, root4);
        System.out.println("The same tree is: " + is_same);

        Object[] a3 = { null,1,2,2,3,4,4,3};
        BTNode root5 = tree_construction(a3, 1);
        Boolean symmetric = is_symmetric(root5);
        System.out.println("The symmetric is: " + symmetric);

        Object[] a4 = { null,6,5,9,2,3};
        BTNode root6 = tree_construction(a4, 1);

        Object[] a5 = { null,6,1,4,2,7};
        BTNode root7 = tree_construction(a5, 1);



        equivalent(root6,root7,3);
        System.out.println(root6.elem);
        System.out.println(root6.left.elem);
        System.out.println(root6.right.elem);
        System.out.println(root6.left.left.elem);
        System.out.println(root6.left.right.elem);

        Object[] a10 = { null,1,7,9,2,6,null,9,null,null,5,11,5};
        BTNode root10 = tree_construction(a10, 1);
        int result10 = max_path_sum(root10);
        int result11 = min_path_sum(root10);
        System.out.println("The max path sum is: " + result10);
        System.out.println("The min path sum is: " + result11);

        Object[] a12 = { null,5,3,8,1,6};
        BTNode root12 = tree_construction(a12, 1);
        OddSwap(root12,1);
        System.out.println(root12.elem);
        System.out.println(root12.left.elem);
        System.out.println(root12.right.elem);

        Object[] a13 = { null,5,8,3,1,6};
        BTNode root13 = tree_construction(a13, 1);
        EvenSwap(root13,1);
        System.out.println(root13.elem);
        System.out.println(root13.left.elem);
        System.out.println(root13.right.elem);
        System.out.println(root13.left.left.elem);
        System.out.println(root13.left.right.elem);

        Object[] a14 = { null,10,5,12,8,7,null,3,9,null,null,null,null,2};
        BTNode root14 = tree_construction(a14, 1);
        int result14 = SumTree(root14,0);
        System.out.println("The sum of the trees is: " + result14);








        // Creating Binary Tree nodes using Recursion
    }
}
