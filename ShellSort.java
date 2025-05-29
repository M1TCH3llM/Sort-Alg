package Sorting;
public class ShellSort {

    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 1, 3, 7, 5};

        // Print the array before sorting
        System.out.println("Before sorting:");
        printArray(numbers);

        // Sort the array
        shellSort(numbers);

        // Print the array after sorting
        System.out.println("After sorting:");
        printArray(numbers);
    }
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 3; gap > 0; gap /= 3) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                // Put temp (the original arr[i]) in its correct location
                arr[j] = temp;
            }
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
