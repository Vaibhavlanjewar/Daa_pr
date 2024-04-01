public class binarySearch18 {
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If the element is present at the middle
            if (arr[mid] == target)
                return mid;
            
            // If the element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > target)
                right = mid - 1;
            
            // Else the element can only be present in right subarray
            else
                left = mid + 1;
        }
        
        // Element is not present in array
        return -1;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 9;
        
        int result = binarySearch(arr, target);
        
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in the array.");
    }
}
