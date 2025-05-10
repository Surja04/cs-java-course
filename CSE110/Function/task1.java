public class task1{
    public static void main(String[]args){
        
        upper_lower_finder("The quick Sand Man");
    }
    public static void upper_lower_finder(String w1){
        int count_1 = 0;
        int count_2 = 0;
        
        for(int i = 0; i < w1.length(); i++){
            char ch = w1.charAt(i);
            int ascii_code = (int)ch;
            
            if(ascii_code >= 65 && ascii_code <= 90){
                count_1++;
            }
            else if(ascii_code >= 97 && ascii_code <= 122){
                count_2++;
            }
        }
        System.out.println("Upper:"+count_1);
        System.out.print("Lower:"+count_2);
    }
}