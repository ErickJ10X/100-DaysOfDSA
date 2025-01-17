package src.dsa.day_6;

import java.util.Arrays;
import java.util.Scanner;

public class Day6_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 6: Two Sum
                Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
                You may assume that each input would have exactly one solution, and you may not use the same element twice.
                You can return the answer in any order.
                """;

        // Print the problem and ask for the input
        Scanner scanner = new Scanner(System.in);
        System.out.println(textProblem);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i + " : ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target: ");
        int m = scanner.nextInt();

        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + m);
        System.out.println("Output: " + Arrays.toString(twoSum(nums, m)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // Initialize the variables
        int[] aux = new int[2];
        int i,j;
        // Loop through the numbers and calculate the sum
        for ( i = 0 ; i< nums.length ; i++){
            for( j = i+1 ; j <  nums.length; j++){
                if (nums[i] + nums[j] == target ) {
                    // Return the indices of the two numbers
                    aux[0] = i;
                    aux[1] = j;
                    return aux;
                }
            }
        }
        return aux;
    }
}
