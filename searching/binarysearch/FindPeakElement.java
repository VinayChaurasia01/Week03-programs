package org.example.searching.binarysearch;

public class FindPeakElement {

    // Method to find a peak element using binary search
    public static int peakElement(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { // Use '<' instead of '!=' for correct termination
            int mid = (left + right) / 2;

            // If mid is greater than its right neighbor, peak is on the left or at mid
            if (arr[mid] > arr[mid + 1]) {
                right = mid; // Keep mid in the range
            } else {
                left = mid + 1; // Move right since peak is ahead
            }
        }
        return arr[left]; // Left will point to a peak
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 7, 8, 3, 4, 5, 9};

        int peak = peakElement(nums);

        System.out.println("Peak element is: " + peak);
    }
}
