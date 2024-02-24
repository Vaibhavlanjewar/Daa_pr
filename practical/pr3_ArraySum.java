package Design_Algo_Analysis.practical;

public class pr3_ArraySum {
    public static int sumOfArray(int[] arr, int n) {
       
        if (n <= 0) {
            return 0;
        }
  
        return sumOfArray(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        int sum = sumOfArray(array, array.length);
        System.out.println("Sum of array elements is: " + sum);
    }
}
