package Sorting;
public class BubbleSort {

    private static int passCount = 0;
    private static int swapCount = 0;
    private static int commparisonCount = 0;

    public static void main(String[] args) {
        // Define an array of numbers                                 
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 1, 3, 7, 5};

        // Print the array before sorting
        System.out.println("Before sorting:");
        printArray(numbers);

        // Sort the array
      bubbleSort(numbers);

        // Print the array after sorting
        System.out.println("After sorting:");
        printArray(numbers);
        System.out.println("Total number of passes: " + passCount);

        System.out.println("Total number of swaps: " + swapCount);
        System.out.println("Total number of comparisons: " + commparisonCount);
    }

    // Bubble sort method
    public static int bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            passCount++;

            System.out.print("Pass " + passCount + ": ");
            printArray(arr);
            // Go through the array and swap if needed
            for (int j = 0; j < n - 1 - i; j++) {
                commparisonCount++;


                if (arr[j] > arr[j + 1]) {
                    // Swap values
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                    
            }

        } 

        if (!swapped) {
               
                // If no two elements were swapped, the array is sorted
                break;
            }
        }
        return passCount;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}