package com.runtimeanalysis.comparesortingtechniques;

import java.util.Random;

public class CompareSortingTime {

    public static void generateRandom(int arr[] , int range){
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(range);
        }
    }

    public static double nanoToMiliSecond(long time){
        return (double) time/1000000;
    }

    public static void main(String[] args) {
          int dataSet[] = {1000,10000,1000000};

        for(int i=0;i<dataSet.length;i++){
            int arr1[] = new int[dataSet[i]];
            generateRandom(arr1,dataSet[i]);

            int arr2[] = arr1;
            int arr3[] = arr1;
            System.out.println("Search for data set " + dataSet[i]);

            //BubbleSort bubbleSort = new BubbleSort();
            double bubbleSortTime = nanoToMiliSecond(BubbleSort.bubbleSortTime(arr1));
            //QuickSort quickSort = new QuickSort();
            double quickSortTime = nanoToMiliSecond(QuickSort.quickSortTime(arr2));
            //MergeSort mergeSort = new MergeSort();
            double mergeSortTime = nanoToMiliSecond(MergeSort.mergeSortTime(arr3));


            System.out.println("Time taken by Bubble sort (ms) : " + bubbleSortTime);
            System.out.println("Time taken by Quick Sort (ms) : " + quickSortTime);
            System.out.println("Time taken by Merge Sort (ms) : " + mergeSortTime);
            System.out.println();
        }
    }
}
