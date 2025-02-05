package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compare {
    public static void main(String[] args) {
        int iterations = 1_000_000; // Number of iterations for testing
        String text = "hello";

        // Measure time for StringBuffer
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;

        // Measure time for StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;

        // Print time taken by each
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " ns");

        // File path for reading large file
        String filepath = "Document.txt";
        int count = 0;

        // Read file and count lines
        try (BufferedReader bf = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = bf.readLine()) != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print error if file reading fails
        }

        // Print total line count
        System.out.println("Total Count of lines in Document file: " + count);
    }
}

