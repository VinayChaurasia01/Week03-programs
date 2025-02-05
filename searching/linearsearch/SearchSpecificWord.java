package org.example.searching.linearsearch;

import java.util.Scanner;

public class SearchSpecificWord {

    // Method to search for a word in an array of sentences
    public static String searchWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) { // Check if the sentence contains the word
                return sentence; // Return the first matching sentence
            }
        }
        return "Not Found"; // Return "Not Found" if the word is not in any sentence
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of sentences from the user
        System.out.println("Enter the number of sentences:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read sentences from user input
        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = scanner.nextLine();
        }

        // Get the word to search for
        System.out.println("Enter the word to search:");
        String word = scanner.next();

        // Call the search method and print the result
        String result = searchWord(sentences, word);
        System.out.println("Result: " + result);
    }
}
