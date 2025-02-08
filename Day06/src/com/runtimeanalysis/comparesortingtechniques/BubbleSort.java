package com.runtimeanalysis.comparesortingtechniques;

public class BubbleSort {
    //create a method bubble sort technique
    public static void bubbleSort(int arr[]){

        int n = arr.length;
        int temp = 0;

        for(int i=0; i < n; i++) {
            boolean flag = false; //create a boolean flag for check swap
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true; //flag true means swap happens
                }
            }
            if (flag == false) { // if flag is false means array already sorted
                break;
            }
        }
    }

    //create a method for calculate time taken by bubble sort
    public static long bubbleSortTime(int arr[]){
        long startTime = System.nanoTime();

        bubbleSort(arr); //call bubble sort function
        long endTime = System.nanoTime();

        return endTime - startTime; // return time taken by bubble sort
    }
}
