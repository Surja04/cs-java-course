// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            //TO DO
            return function(root, 0);
        }
        private static Integer function(BTNode node, int level) {
            if (node == null) {
                return 0;
            }
            if(level == 0)
            {
                return (Integer)node.elem+function(node.left,level+1)+function(node.right,level+1);
            }
            return (Integer)node.elem%level+function(node.left, level+1)+function(node.right, level+1);

        }
        //============================================================================

}
