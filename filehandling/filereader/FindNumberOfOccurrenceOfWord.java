package filehandling.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindNumberOfOccurrenceOfWord {

    public static void main(String[] args){

        String filepath = "Document.txt"; //file path exist in this directory
        String target = "It";
        int count = 0 ; // make count to count the number of words in file
        try(BufferedReader bf = new BufferedReader(new FileReader(filepath))){
            String line;
            //write a loop for read file line by line
            while((line=bf.readLine()) != null){
                System.out.println(line);
                //create a string array for storing all words of the line
                String[] arr = line.split(" ");
                //iterate string array
                for(String word : arr){
                    if(word.equals(target)){ // check current word is equals to target word
                        count++; // increase count
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); //throw exception when file not found
        }
        //display the number of words of target in file
        System.out.println("Total Count of 'It' in the File is : "+ count);
    }
}

