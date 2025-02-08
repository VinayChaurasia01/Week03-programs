package com.runtimeanalysis.filereadingefficiency;

import java.io.*;

public class LargeFileReadingEfficiency {

    //File generated function
    /*public static void generateFile(String str,long size){

        String text="This is text line. ";
        long targetSize = size * 1024 * 1024;
        int currentSize=0;

        try(BufferedWriter writer=new BufferedWriter(new FileWriter(str))) {

            while (currentSize < targetSize) {
                writer.write(text);
                currentSize += text.length();
            }


        }catch (Exception e){
            System.out.println("FileWriting error");
        }

    }*/


    //FileReading using File reader
    public static long fileReaderTime(String filePath) throws Exception {
        FileReader fr=new FileReader(filePath);
        // BufferedReader reader =new BufferedReader(fr);
        long startTime =System.currentTimeMillis();
        while(fr.read()!=-1){

        } //read file

        return System.currentTimeMillis()-startTime;
    }


    //File reading using inputstreamreader
    public static long inputStreamReaderTime(String filePath) throws Exception {
        InputStreamReader ir =new InputStreamReader(new FileInputStream(filePath));
        long startTime =System.currentTimeMillis();
        while(ir.read()!=-1){

        }
        return System.currentTimeMillis()-startTime;
    }

    //compare FileReader and InputStreamReader
    public static void compareFunction(String file) throws Exception {

        long fileReaderTimeInMs=fileReaderTime(file);
        long inputStreamReaderTimeInMs=inputStreamReaderTime(file);

        System.out.println("FileReader time (ms) "+fileReaderTimeInMs);
        System.out.println("InputStreamReader time (ms) "+inputStreamReaderTimeInMs);

    }

    public static void main(String[] args) throws Exception {
        //create a array for different sizes of file
        long[] size={1,100,500};

        //display all comparison
        System.out.println("\nData size "+size[0]+"mb");
        compareFunction("1MB_File.txt");

        System.out.println("\nData size "+size[1]+"mb");
        compareFunction("100MB_File.txt");

        System.out.println("\nData size "+size[2]+"mb");
        compareFunction("500MB_File.txt");

    }
}