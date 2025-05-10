public class Quiz5a {
    public static void main(String args[]) {
        float [] myArray = new float[10];
        float [] b;
        int index1 = 0, index2 = 0;
        index1 = 1;
        b =  myArray;
        while (index1 < 10){
            myArray[index1] = index1 + 1;
            index2 = 1;
            while (index2 < index1 ){
                myArray[index1] = b[index2 - 1] + myArray[index2] - index1;
                index2 = index2 + 1;
            }
            System.out.println(myArray[index2]);
            index1 = index1 + 1;
        }
    }
}

