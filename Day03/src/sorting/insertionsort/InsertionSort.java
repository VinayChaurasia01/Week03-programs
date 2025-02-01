package sorting.insertionsort;

public class InsertionSort {
    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted
            int j = i - 1;

            // Shift elements of the sorted part that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void printArray(int []employeeIDs){
        for(int i=0;i<employeeIDs.length;i++){
            System.out.print(employeeIDs[i] + " ");
        }
    }
    // Main method to test the sorting algorithm
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 108, 101, 103}; // Unsorted array
        System.out.print("Before sorting: ");
        printArray(employeeIDs);

        System.out.println();
        insertionSort(employeeIDs);

        System.out.print("After sorting: ");
        printArray(employeeIDs);
    }
}
