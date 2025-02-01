package sorting.quicksort;

import java.util.Arrays;

// Class to handle QuickSort operations
class Product {

    // Method to perform QuickSort on the given array
    public static void quickSort(int[] productPrice, int low, int high) {
        if (low < high) { // Base condition to stop recursion
            int pi = partition(productPrice, low, high); // Get the partition index

            // Recursively sort the left and right subarrays
            quickSort(productPrice, low, pi - 1); // Sort the left half
            quickSort(productPrice, pi + 1, high); // Sort the right half
        }
    }

    // Method to partition the array using the last element as the pivot
    private static int partition(int[] productPrice, int low, int high) {
        int pivot = productPrice[high]; // Selecting the last element as the pivot
        int i = low - 1; // Pointer for the smaller element

        // Loop through the array to rearrange elements
        for (int j = low; j < high; j++) {
            if (productPrice[j] < pivot) { // If the current element is smaller than the pivot
                i++; // Move the pointer forward
                // Swap productPrice[i] and productPrice[j]
                int temp = productPrice[i];
                productPrice[i] = productPrice[j];
                productPrice[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1 to place it in its correct position
        int temp = productPrice[i + 1];
        productPrice[i + 1] = productPrice[high];
        productPrice[high] = temp;

        return i + 1; // Return the partition index
    }
}

// Main class to test QuickSort
public class QuickSort {

    public static void main(String[] args) {
        int[] productPrice = {5, 3, 8, 4, 2}; // Sample array

        System.out.println("Before sorting : " + Arrays.toString(productPrice));

        // Calling QuickSort to sort the array
        Product.quickSort(productPrice, 0, productPrice.length - 1);

        System.out.println();
        System.out.println("After sorting : " + Arrays.toString(productPrice));
    }
}
