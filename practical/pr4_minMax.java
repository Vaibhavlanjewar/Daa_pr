package Design_Algo_Analysis.practical;

public class pr4_minMax {
    public static void main(String[] args) {
        int[] numbers = {34, -10, 78, 56, 0, 23, -55, 19, 73, 88}; // Example array
        findMinMax(numbers);
    }

    public static void findMinMax(int[] arr) {
        // Initialize min and max to the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Loop through the array to find the min and max values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max
            } else if (arr[i] < min) {
                min = arr[i]; // Update min
            }
        }

        // Print the results
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}
