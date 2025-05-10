//Task 02: Container with Most Water
class Task2{

    //Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){

        
        int index_left = 0; 
        int index_right = height.length - 1;
        int maximum_area = 0; 
        
        while (index_left < index_right) {
           
            int c_height=0;
            if(height[index_left]<height[index_right])
            {
              c_height = height[index_left];
            }
            else
            {
              c_height = height[index_right];
            }
            int c_width = index_right - index_left; 
            int c_area = c_height * c_width; 

            
            if (c_area > maximum_area) {
                maximum_area = c_area;
            }

            
            if (height[index_left] < height[index_right]) {
                index_left++;
            } 
            else {
                index_right--; 
            }
        }     
        System.out.print(maximum_area);

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
 System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
