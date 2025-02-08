package com.runtimeanalysis.string;

public class CompareBuilderBufferAndStringExecutionTime {

    //String concatenation
    public static long stringConcat(String str ,int length){

        long startTime = System.nanoTime();
        String con = "";

        for(int i=0;i<length;i++){ //write a loop for concatenation
            con += str ;
        }

        long endTime = System.nanoTime();

        return endTime-startTime; // return total time
    }

    //create a function for string builder concatenation
    public static long stringBuilderConcat(StringBuilder str ,int length){

        long startTime = System.nanoTime();
        StringBuilder concat = new StringBuilder("");
        for(int i=0;i<length;i++){
            concat.append(str);
        }

        long endTime = System.nanoTime();

        return endTime-startTime; //return total time
    }

    //create a function for string buffer concatenation
    public static long stringBufferConcat(StringBuffer str ,int length){

        long startTime = System.nanoTime();
        StringBuffer concat = new StringBuffer("");
        for(int i=0;i<length;i++){
            concat.append(str);
        }

        long endTime = System.nanoTime();

        return endTime-startTime; //return total time
    }

    //convert nano to mile
    public static double nanoToMiliSecond(long time){
        return (double) time/1000000;
    }

    public static void main(String[] args) {
        int dataSet[] = {1000,10000,1000000};

        //display comparison for each data set
        for(int i=0;i<dataSet.length;i++){
            int arr[] = new int[dataSet[i]];

            System.out.println("Concatenation for data set " + dataSet[i]);

            System.out.println("Time take by string (ms): " +
                    nanoToMiliSecond(stringConcat("Vinay" , dataSet[i])));
            System.out.println("Time taken by StringBuilder (ms): " +
                    nanoToMiliSecond(stringBuilderConcat(new StringBuilder("Vinay") , dataSet[i])));
            System.out.println("Time taken by StringBuffer (ms): " +
                    nanoToMiliSecond(stringBufferConcat(new StringBuffer("Vinay"),dataSet[i])));
            System.out.println();
        }
    }
}
