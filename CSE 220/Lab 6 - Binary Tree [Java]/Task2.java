// Complete the smallestLevel method
public class Task2 {

    //===================================TASK#2===================================

    // This method takes only 3 parameters
    // 1st one is root
    // 2nd one is an array where arr.length==depthOfTree
    // It means if the depth of the tree is 3 then the length of array is 3
    // 3rd one is there to help you count the levels
    // Updating the levelArray should be the main goal of this method
    // At times you may need to typeCast root.elem to Integer
    // This method doesn't return anything
    public static void smallestLevel( BTNode root, Integer[] levelArray, int lvl ){
//       Integer current_min = levelArray[lvl];
       if(root == null)
       {
           return;
       }

        Integer current_min = levelArray[lvl];

       if(current_min == null || current_min > (Integer)root.elem)
       {
           levelArray[lvl] = (Integer)root.elem;
       }
       smallestLevel( root.left, levelArray, lvl+1);
       smallestLevel( root.right, levelArray, lvl+1);


    }
    //============================================================================

}
