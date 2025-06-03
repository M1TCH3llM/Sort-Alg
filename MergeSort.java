package Sorting;

public class MergeSort {
    public static void main(String args[]){

        int[] array = {64, 34, 25, 12, 22, 11, 90, 1, 3, 7, 5};

        System.out.println("Before sorting:");
        printArray(array);


        mergeSort(array);

       
        System.out.println("After sorting:");
        printArray(array);

    
    }
    // Merge sort method
    private static void mergeSort(int[] array){

        int length = array.length;
        if(length < 2) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array index
        int j = 0; // right array index


        // Split the array into two halves 
        for (; i < length; i ++) {
            // copy elements to left and right arrays
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0; 
        int l = 0; 
        int r = 0;

        //check conditionfs for merging
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] <= rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    } 

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


