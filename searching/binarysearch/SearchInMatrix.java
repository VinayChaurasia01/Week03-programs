package org.example.searching.binarysearch;

public class SearchInMatrix {

    // Method to search for a target value in a sorted 2D matrix using binary search
    public static boolean search(int arr[][], int target) {
        int rows = arr.length, cols = arr[0].length;
        int left = 0, right = rows * cols - 1; // Treat matrix as a 1D sorted array

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent integer overflow
            int row = mid / cols; // Convert 1D index to row index
            int col = mid % cols; // Convert 1D index to column index

            if (arr[row][col] == target) {
                return true; // Target found
            } else if (arr[row][col] > target) {
                right = mid - 1; // Search in the left half
            } else {
                left = mid + 1; // Search in the right half
            }
        }
        return false; // Target not found
    }

    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };

        int target = 9;
        boolean isFound = search(arr, target);

        System.out.println("Element is found: " + isFound);
    }
}
