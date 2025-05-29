package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        // 1. Define an array of numbers
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 1, 3, 7, 5};

        // 2. Print the array before sorting
        System.out.println("Before sorting:");
        printArray(numbers);

        // 3. Sort the array
        selectionSort(numbers);

        // 4. Print the array after sorting
        System.out.println("After sorting:");
        printArray(numbers);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
    
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        // no return value needed
    }

     // Utility to print array contents
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
