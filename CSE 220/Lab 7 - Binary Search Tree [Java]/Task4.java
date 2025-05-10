// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
      if (root == null)
    {
        return 0;
    }
      return function(root.left,root.right);
    }
    public static Integer function( BSTNode left, BSTNode right)
    {
        if (left == null || right == null) {
            return 0;
        }
        Integer sum = left.elem + right.elem;
        return sum+ function(left.left,right.right)+function(left.right,right.left);
    }
    //===============================================================


}
