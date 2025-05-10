public class tracing_2{
    public static void main(String args[]){
        int [] myArray = {54, -11, 5, 5, 12, 0, 9, 18, -9, 26};
        int [] b;
        int index1 = 0, index2 = 0;
        index1 = 1;
        b =  myArray;
        while (index1 < 10){
            myArray[index1] = 3+index1;
            index2 = 1;
            while (index2 < index1 ){
                myArray[index1] = b[index1] + (--myArray[index2]);
                index2 = index2 + 1;
            }
            System.out.println(myArray[index1]);
            index1 = index1 + 1;
        }
    }
}

