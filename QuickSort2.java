package Sorting;

public class QuickSort2 {
    public static void main(String args[]) {
        
        int[] array = {64, 34, 25, 12, 22, 11, 90, 5};
        System.out.println("Before sorting:");
        printArray(array);
        
        // array.length - 1 is the last index of the array bercomes the high index
        quickSort(array, 0, array.length - 1);

        System.out.println("After sorting:");
        printArray(array);
    }

    private static void quickSort(int[] array, int low, int high) {

        if (low >= high) return;

        int pivot = partition(array, low, high);
        quickSort(array, low, pivot - 1);
        quickSort(array, pivot + 1, high);

    }

    private static int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
