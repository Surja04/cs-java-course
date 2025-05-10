// Complete the convertMirror method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll need to create a new Mirrored Tree and return the new root
    public static BTNode convertMirror( BTNode root ){
        if(root == null)
        {
            return null;
        }
        BTNode left = convertMirror(root.left);
        BTNode right = convertMirror(root.right);
        root.left = right;
        root.right = left;

        return root;

    }
    //==================================================

}
