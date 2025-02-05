package org.example.searching.binarysearch;

public class FirstAndLastOccurrence {

    // Method to find the first occurrence of the target in a sorted array
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow

            if (arr[mid] == target) {
                first = mid;  // Store the index, but continue searching in the left half
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }
        return first; // Returns -1 if not found
    }

    // Method to find the last occurrence of the target in a sorted array
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;  // Store the index, but continue searching in the right half
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last; // Returns -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 4, 5}; // Sorted array
        int target = 3; // Target element to find

        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
