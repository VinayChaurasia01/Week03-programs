package sorting.heapsort;

import java.util.Arrays;

class JobApplicantSalarySorter {

    // Heap Sort function
    public void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify function
    private void heapify(int[] salaries, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check if right child is larger than root
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;

            heapify(salaries, n, largest);
        }
    }
}


public class HeapSort {

    public static void main(String[] args) {

        JobApplicantSalarySorter sorter = new JobApplicantSalarySorter();

        // Input the number of salary demands

        int[] salaries = {85, 72, 90, 65, 78};

        System.out.println("unsorted array : " + Arrays.toString(salaries));

        // Sort and display salaries
        System.out.println("Sorting salaries using Heap Sort...");
        sorter.heapSort(salaries);

        System.out.println("Sorted salaries:" + Arrays.toString(salaries));

    }
}
