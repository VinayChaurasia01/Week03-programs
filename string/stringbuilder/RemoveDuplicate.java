package string.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicate {

    //Create a function for remove duplicate characters from a string
    public static String duplicate(StringBuilder str){
        //create a hashset for storing only unique values
        HashSet<Character> set = new HashSet<>();

        //a for loop for iterating all elements of the string
        for(int i=0;i<str.length();i++){
            //to check element is contains in set or not
            if(!set.contains(str.charAt(i))) {
                //if not contains then add in the set
                set.add(str.charAt(i));
            }
        }

        //iterate a loop for check the element is available in set or not
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i)) && !set.isEmpty()){
                //if character is available in the then remove it from set
                set.remove(str.charAt(i));
            }else{
                //if not available in set then remove it from string builder
                str.deleteCharAt(i);
            }
        }

        //return a string with unique character
        return str.toString();
    }
    //main method
    public static void main(String[] args) {
        //create a object of string builder
        StringBuilder sb = new StringBuilder("");
        //append a string in empty string builder
        sb.append("vinay chaurasi");

        //print string before removing duplicate characters
        System.out.println("Before removing duplicate : " + sb);

        String unique = duplicate(sb);

        //print string after removing duplicate characters
        System.out.println("After removing duplicate : " + unique);
    }
}
