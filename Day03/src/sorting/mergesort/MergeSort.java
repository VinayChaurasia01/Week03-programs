package sorting.mergesort;

import java.util.Arrays;

// Class to handle Merge Sort operations
class BookStore {

    // Method to perform Merge Sort on the given array
    public static void mergeSort(int[] bookPrice, int left, int right) {
        if (left < right) { // Base condition to stop recursion
            int mid = left + (right - left) / 2; // Finding the middle index

            // Recursively sorting the left and right halves
            mergeSort(bookPrice, left, mid);
            mergeSort(bookPrice, mid + 1, right);

            // Merging the sorted halves
            merge(bookPrice, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    private static void merge(int[] bookPrice, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of left subarray
        int n2 = right - mid;     // Size of right subarray

        // Creating temporary arrays for left and right subarrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copying elements from the original array to temporary arrays
        System.arraycopy(bookPrice, left, leftArr, 0, n1);
        System.arraycopy(bookPrice, mid + 1, rightArr, 0, n2);

        // Merging the two sorted subarrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) { // Choosing the smaller element
                bookPrice[k++] = leftArr[i++];
            } else {
                bookPrice[k++] = rightArr[j++];
            }
        }

        // Copying any remaining elements from the left subarray
        while (i < n1) {
            bookPrice[k++] = leftArr[i++];
        }

        // Copying any remaining elements from the right subarray
        while (j < n2) {
            bookPrice[k++] = rightArr[j++];
        }
    }
}

// Main class to test Merge Sort
public class MergeSort {

    public static void main(String[] args) {
        int[] bookPrice = {5, 3, 8, 4, 2}; // Sample array

        System.out.print("Before merge sort : " + Arrays.toString(bookPrice));
        System.out.println();

        // Calling Merge Sort to sort the array
        BookStore.mergeSort(bookPrice, 0, bookPrice.length - 1);

        System.out.println("After sorting : " + Arrays.toString(bookPrice));
    }
}
