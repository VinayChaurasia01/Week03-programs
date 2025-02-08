package com.runtimeanalysis.comparesortingtechniques;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) { // Base condition to stop recursion
            int mid = left + (right - left) / 2; // Finding the middle index

            // Recursively sorting the left and right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merging the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of left subarray
        int n2 = right - mid;     // Size of right subarray

        // Creating temporary arrays for left and right subarrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copying elements from the original array to temporary arrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Merging the two sorted subarrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) { // Choosing the smaller element
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copying any remaining elements from the left subarray
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        // Copying any remaining elements from the right subarray
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    //create a function for calculating time taken by merge sort
    public static long mergeSortTime(int arr[]){
        long startTime = System.nanoTime();

        mergeSort(arr , 0 , arr.length-1);

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
