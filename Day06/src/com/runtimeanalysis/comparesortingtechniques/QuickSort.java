package com.runtimeanalysis.comparesortingtechniques;

public class QuickSort {
    // Quick Sort Implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    //create a partition function for divide a array in two parts and sort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    //create a function for calculating time taken by quick sort
    public static long quickSortTime(int arr[]){

        long startTime = System.nanoTime();
        quickSort(arr , 0 , arr.length-1);

        long endTime = System.nanoTime();

        return endTime -startTime; //return total time taken by quicksort
    }
}
