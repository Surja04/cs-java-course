public class MeanOfArray {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        int i = 0;
        int result = mean(arr,sum,i);
        System.out.println(result);
    }
    public static int mean(int arr[],int sum, int i)
    {
        if(i >= arr.length)
        {
            sum = sum/arr.length;
            return sum;
        }
        sum += arr[i];
        return mean(arr,sum,i+1);
    }

}
