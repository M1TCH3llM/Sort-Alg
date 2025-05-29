package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int[] number = {64, 34, 25, 12, 22, 11, 90, 1, 3, 7, 5};
    
        System.out.println("Original array:");
        printArray(number);
    
        insertionSort(number);
    
        System.out.println("Sorted array:");
        printArray(number);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test insertion sort
}
