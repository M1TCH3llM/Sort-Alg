public class QuickSort {
    
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        System.out.println("Before sorting:");
        printArray(myArray);
        
        // myArray.length - 1 is the last index of the array bercomes the high index
        quickSort(myArray, 0, myArray.length - 1);

        System.out.println("After sorting:");
        printArray(myArray);
    }

    // methode to perform quicksort takes an array and the low and high indices
    // public means that this method can be accessed from outside the class
    // static means that this method can be called without creating an instance of the class
    // void means that this method does not return any value
    public static void quickSort(int[] arr, int low, int high) {
        // Base case: if low is less than high, continue sorting
        // ensurers that the array has more than one element to sort
        // if low is greater than or equal to high, the array is already sorted
        // and no further action is needed
        if (low < high) {

            // Partitioning the array
            int pivot = arr[high]; // using last element as pivot
            // i is the index of the smaller element
            // it starts at low - 1 because we will increment it before the first comparison
            int i = low - 1;
            
            // Loop through the array from low to high ( - 1) ... high is already - 1 when methode is called in the main method
            // for loop will exicute as long as j is less than high
            // each pass index (j) will be incremented by 1
            for (int j = low; j < high; j++) {
                // If the current element is less than or equal to the pivot
                // we increment i and swap arr[i] with arr[j]
                if (arr[j] <= pivot) {
                    i++;
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
    
            // Place pivot at correct position
            // After the loop, i will be at the position where the pivot should be placed
            // Swap the pivot element with the element at i + 1
            // This ensures that all elements to the left of the pivot are less than or equal to the pivot
            // and all elements to the right are greater than the pivot
            // This is the final step of the partitioning process
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
    
            // The pivot is now at the correct position
            // i + 1 is the index of the pivot element after partitioning
            // This index is used to divide the array into two parts for further sorting
            int pivotIndex = i + 1;
    
            // Recursively sort elements before and after partition
            // After partitioning, we recursively call quickSort on the two subarrays
            // The first subarray is from low to pivotIndex - 1
            // The second subarray is from pivotIndex + 1 to high
            // This ensures that both parts of the array are sorted
            // The recursive calls will continue until the base case is reached
            // where low is no longer less than high
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
   
    // Utility to print array contents
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

