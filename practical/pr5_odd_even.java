package Design_Algo_Analysis.practical;

public class pr5_odd_even {
    public static void main(String[] args) {
        int[] originalArray = {34, 45, 22, 13, 56, 93, 99, 12, 20, 31};
        separateOddEven(originalArray);
    }

    public static void separateOddEven(int[] arr) {
        int oddCount = 0, evenCount = 0;
        
        // Count odd and even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }
        
        // Create arrays for odd and even numbers
        int[] oddArray = new int[oddCount];
        int[] evenArray = new int[evenCount];
        
        // Reset counts for use as indices
        oddCount = 0;
        evenCount = 0;
        
        // Populate odd and even arrays
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenCount++] = arr[i];
            } else {
                oddArray[oddCount++] = arr[i];
            }
        }
        
        // Print the results
        System.out.println("Odd Array: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println("\nEven Array: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }  
    
}
