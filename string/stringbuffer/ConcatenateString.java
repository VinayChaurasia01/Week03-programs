package string.stringbuffer;

import java.util.Arrays;

public class ConcatenateString {

    //create a method for concatenation
    public static String concatenation(String str[] ){
        StringBuffer sb = new StringBuffer("");//create a empty string buffer

        //loop for appends all elements of the array in string buffer
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }

        //return final string
        return sb.toString();
    }
    public static void main(String[] args) {

        String str[] = {"Vinay" , "Pushpendra" , "Shivshankar" , "Somya"};

        System.out.println("Before concatenation : " + Arrays.toString(str));

        System.out.println("After concatenate : " + concatenation(str));
    }
}
