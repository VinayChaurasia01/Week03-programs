package filehandling.inputstream;

import java.io.*;

public class InputStreamToFile {
    public static void main(String[] args) {
        String filePath = "Document.txt"; // File where input will be saved

        try (
                InputStreamReader isr = new InputStreamReader(System.in); // Read from console
                BufferedReader br = new BufferedReader(isr); // Efficient reading
                FileWriter fw = new FileWriter(filePath, true); // Open file in append mode
                BufferedWriter bw = new BufferedWriter(fw) // Buffered writer for efficiency
        ) {

            System.out.println("Enter text to write to file (type 'exit' to stop):");

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) { // Read until 'exit' is entered
                bw.write(input);
                bw.newLine(); // Move to the next line in the file
            }

            System.out.println("User input has been saved to " + filePath);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage()); // Handle exceptions
        }
    }
}
