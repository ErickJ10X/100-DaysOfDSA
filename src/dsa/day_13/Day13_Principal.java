package src.dsa.day_13;

import java.util.Arrays;
import java.util.Scanner;

public class Day13_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 13: Two Sum II - Input array is sorted
                Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
                Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
                Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
                The tests are generated such that there is exactly one solution. You may not use the same element twice.
                Your solution must use only constant extra space.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();
        sc.close();
        // Print the output
        System.out.println("Input: numbers = " + Arrays.toString(numbers) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        // variables to store the result and the indexes of the array
        int[] result = new int[2];
        int i=0, b=numbers.length-1;
        // loop to find the two numbers that add up to the target
        while(i<b){
            // if the sum of the two numbers is equal to the target, store the indexes in the result array
            if (numbers[i] + numbers[b] == target){
                result[0] = i+1;
                result[1] = b+1;
                return result;
                // if the sum of the two numbers is less than the target, increment the first index
            }else if ( numbers[i] + numbers[b] < target ){
                i++;
                b=numbers.length-1;
                // if the sum of the two numbers is greater than the target, decrement the second index
            }else {
                b--;
            }
        }
        return result;
    }
}
