package com.runtimeanalysis.binaryandlinearsearch;

import java.util.Arrays;
import java.util.Random;

public class CompareLinearAndBinarySearch {

    //linear search Calculate timing to search target
    public static long linearSearch(int arr[] , int target){

        long startTime = System.nanoTime();
        for(int i=0;i<arr.length;i++){ //iterate linearly and compare element to target
            if(arr[i] == target){
                break; // if target found then break
            }
        }

        long endTime = System.nanoTime();
        return endTime-startTime; //return time taken by linear search
    }

    //calculate time to search target by binary search
    public static long binarySearch(int arr[] , int target){

        int start = 0;
        int end = arr.length-1;
        long  startTime = System.nanoTime();

        //binary search
        while(start <= end){

            //calculate mid
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                break;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        long  endTime = System.nanoTime();

        return endTime - startTime; //return total time to search element
    }

    //create random function for generating random values
    public static void generateRandom(int arr[] , int range){
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(range); //store in array random values
        }
    }

    //convert nano second to mile second
    public static double nanoToMiliSecond(long time){
        return (double) time/1000000;
    }

    //main method
    public static void main(String[] args) {
        //data set
        int dataSet[] = {1000,10000,1000000};

        //iterate for different data sets
        for(int i=0;i<dataSet.length;i++){
            int arr[] = new int[dataSet[i]];
            generateRandom(arr,dataSet[i]);
            Arrays.sort(arr);
            double binarySearchTime = nanoToMiliSecond(binarySearch(arr,999));
            double linearSearchTime = nanoToMiliSecond(linearSearch(arr,999));

            System.out.println("Search for data set " + dataSet[i]);

            System.out.println("Time taken by linear search (ms) : " + linearSearchTime);
            System.out.println("Time taken by binary search (ms) : " + binarySearchTime);
            System.out.println();
        }
    }
}
