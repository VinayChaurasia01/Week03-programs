package sorting.bubblesort;

import java.util.Scanner;

public class BubbleSort {
    //function that sorts the array
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(marks[j-1] > marks[j]){
                    //swap elements
                    temp = marks[j-1];
                    marks[j-1] = marks[j];
                    marks[j] = temp;
                }
            }
        }
    }

    public static void printArray(int []marks){
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int length = input.nextInt();
        int marks[] = new int[length];
        for(int i=0;i<length;i++){
            marks[i] = input.nextInt();
        }

        //print array before sorting
        System.out.print("Before sorting :");
        printArray(marks);

        System.out.println();
        //call sotring function
        bubbleSort(marks);

        //print after sorting array
        System.out.print("After sorting :");
        printArray(marks);
    }
}
