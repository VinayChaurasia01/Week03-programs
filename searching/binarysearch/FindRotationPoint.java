package org.example.searching.binarysearch;

public class FindRotationPoint {

    // Method to find the index where the sorted array was rotated
    public static int findRotationIndex(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left != right) { // Continue until left and right pointers converge
            int mid = (left + right) / 2;

            // If mid element is greater than the rightmost element,
            // the rotation point is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else { // Otherwise, it's in the left half (or is the mid itself)
                right = mid;
            }
        }
        return left; // Left will point to the rotation index
    }

    public static void main(String[] args) {
        int nums[] = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6}; // Rotated sorted array
        int index = findRotationIndex(nums);

        System.out.println("Rotation point is: " + index); // Output the index where rotation happened
    }
}
