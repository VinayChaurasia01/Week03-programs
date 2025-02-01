package sorting.selectionsort;

import java.util.Arrays;

class Student{
    // Method to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
public class SelectionSort {
    // Main method to test the sorting algorithm
    public static void main(String[] args) {
        int[] examScores = {85, 72, 90, 65, 78}; // Unsorted array
        System.out.println("Before sorting: " + Arrays.toString(examScores));

        Student.selectionSort(examScores);

        System.out.println("After sorting: " + Arrays.toString(examScores));
    }
}

