package string.stringbuilder;

public class ReverseString {

    //create a method for reversing a string
    public static String reverseString(StringBuilder string ){
        //reverse a string builder by using inbuilt method reverse()
        string.reverse();

        //return reversed string
        return string.toString();
    }
    //main method
    public static void main(String[] args) {

        //create a string builder object with empty string
        StringBuilder str = new StringBuilder("");
        //add string in empty string builder
        str.append("hello");
        //print reversed string
        System.out.println("Before reverse : " + str + "\nafter reverse : " + reverseString(str));

    }
}
