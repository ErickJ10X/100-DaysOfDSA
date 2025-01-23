package src.dsa.day_12;

import java.util.Arrays;

public class Day12_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 12: Squares of a Sorted Array
                Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        int[] nums = {-4,-1,0,3,10};
        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        // variables to store the result and the indexes of the array
        int[] result = new int[nums.length];
        int i,a=0,b=nums.length-1;
        // loop to calculate the squares of the elements and store them in the result array
        for (i=nums.length-1; i>= 0 ; i--  ){
            if ( (nums[a]*nums[a]) > (nums[b]*nums[b]) ){
                // store the square of the element in the result array
                result[i]= nums[a]*nums[a];
                a++;
            }else{
                result[i]=nums[b]*nums[b];
                b--;
            }
        }
        return result;
    }
}
