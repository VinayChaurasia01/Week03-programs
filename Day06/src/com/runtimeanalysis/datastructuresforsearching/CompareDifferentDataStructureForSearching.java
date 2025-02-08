package com.runtimeanalysis.datastructuresforsearching;

import java.util.*;

public class CompareDifferentDataStructureForSearching {

    //create a function for linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { //check element is equals to target
                return i;
            }
        }
        return -1; //return -1 if target is not found
    }

    //create a function for compare searching performance
    public static void compareSearchPerformance(int size) {
        Random random = new Random();//create random class object for generate random values
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>(); //hash set
        TreeSet<Integer> treeSet = new TreeSet<>(); //tree set

        // Fill data structures
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(size * 10); //generate value in under boundary
            array[i] = num;
            hashSet.add(num);
            treeSet.add(num);
        }

        //set target
        int target = 999; // Pick a middle element as target

        // Measure Array Search (O(N))
        long startTime = System.nanoTime();
        linearSearch(array, target);
        double arrayTime = nanoToMiliSecond((System.nanoTime() - startTime));

        // Measure HashSet Search (O(1))
        startTime = System.nanoTime();
        hashSet.contains(target);
        double hashSetTime = nanoToMiliSecond(System.nanoTime() - startTime);

        // Measure TreeSet Search (O(log N))
        startTime = System.nanoTime();
        treeSet.contains(target);
        double treeSetTime = nanoToMiliSecond(System.nanoTime() - startTime);

        //display result
        System.out.println("Time taken by linear search (ms): " + arrayTime);
        System.out.println("Time taken by hashSet (ms): " + hashSetTime );
        System.out.println("Time taken by treeSet (ms): " + treeSetTime);
        System.out.println();
    }

    //create a function to convert nano to mile
    public static double nanoToMiliSecond(long time){
        return (double) time/1000000;
    }

    public static void main(String[] args) {
        //create a array for different datasets
        int[] datasetSizes = {1000, 100000, 1000000};
        for (int size : datasetSizes) {
            System.out.println("Searching for data set " + size);
            compareSearchPerformance(size); //perform comparison
        }
    }
}

