package org.example.searching.linearsearch;

public class FindFirstNegativeNumber {

    //create a method to find first occurrence of negative integer in an array
    public static int findNegative(int nums[]){
        //iterate array all elements
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){ // check number is negative
                return i; //return index of the number
            }
        }
        return -1; // return -1 when number is not found
    }
    public static void main(String[] args) {

        int nums[] = {4,5,7,1,2,-7,4,-1,5};

        int ans = findNegative(nums); //call method and store in ans

        //display ans
        System.out.println("First negative number index : " + ans);

    }
}
