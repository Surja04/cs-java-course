// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
             return helper( root, 0);
    }
    private static Integer helper(BTNode node , Integer level)
    {
       if(node == null)
       {
           return 0;
       }
       if(level%2 == 0)
       {
           return -(Integer)node.elem + helper(node.left,level+1)+ helper(node.right,level+1);
       }
        return (Integer)node.elem + helper(node.left,level+1)+ helper(node.right,level+1);

    }
    //============================================================================

}