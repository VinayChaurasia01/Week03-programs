package org.example.searching.challenge;

import java.util.Arrays;

public class BinaryAndLinearSearch {

    // Method to find the first missing positive integer in an unsorted array
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Rearranging numbers in their correct positions if possible
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] and arr[arr[i] - 1] to place numbers correctly
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Finding the first missing positive number
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1; // If all numbers are in place, return next positive integer
    }

    // Standard Binary Search method to find a target in a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent integer overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 7, 8, 2}; // Unsorted array
        int target = 7; // Element to search

        // Finding the first missing positive integer using a rearrangement approach
        int missingNumber = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missingNumber);

        // Sorting the array for Binary Search
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Searching for the target using Binary Search
        int index = binarySearch(arr, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
