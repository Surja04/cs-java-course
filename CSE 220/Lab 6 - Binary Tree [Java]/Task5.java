// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        Integer left = sum(root.left);
        Integer right = sum(root.right);
        return left - right;

    }
    private static Integer sum(BTNode node)
    {
        if(node == null)
        {
            return 0;
        }
        Integer temp = (Integer)node.elem;
        Integer left = sum(node.left);
        Integer right = sum(node.right);
        return left + right + temp;
    }
    //============================================================================

}