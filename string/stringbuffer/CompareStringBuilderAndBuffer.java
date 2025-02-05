package string.stringbuffer;

public class CompareStringBuilderAndBuffer {

    //create a method for calculating string BufferTime
    public static long calculateBufferTime(StringBuffer sb){

        long endTime,startTime;

        //initialize startTime before start append string
        startTime = System.nanoTime();

        //a loop for append 1 million time a string
        for(int i=0;i<1000000;i++){
            sb.append("Hello ");
        }
        //end time of string buffer append string
        endTime = System.nanoTime();

        //return total time taken to append 1 million string
        return endTime-startTime;
    }

    //create a function for calculating string Builder time
    public static long calculateBuilderTime(StringBuilder sb){
        long endTime,startTime;

        //initialize start time
        startTime = System.nanoTime();

        //iterate a loop 1 million times
        for(int i=0;i<1000000;i++){
            sb.append("Hello ");
        }
        //calculate end time to append a string 1 million times
        endTime = System.nanoTime();

        //calculate total time and return
        return endTime-startTime;
    }
    // main method
    public static void main(String[] args) {
        //create string buffer and string builder objects with empty string
        StringBuffer sb  = new StringBuffer("");
        StringBuilder sb2 = new StringBuilder("");

        //total time taken by string Buffer and print its time
        long endTimeOfBuffer = calculateBufferTime(sb);
        System.out.println("Time taken by StringBuffer : " + endTimeOfBuffer);

        //total time taken by string builder and print its time
        long endTimeOfBuilder = calculateBuilderTime(sb2);
        System.out.println("Time taken by StringBuilder : " + endTimeOfBuilder);

        //check which one is faster
        if(endTimeOfBuilder < endTimeOfBuffer){
            System.out.println("String Builder is more faster than String Buffer !");
        }else{
            System.out.println("String Buffer is more faster than String Builder !");
        }
    }
}
