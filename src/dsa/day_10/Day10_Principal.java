package src.dsa.day_10;

import java.util.Arrays;
import java.util.Scanner;

public class Day10_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 10: Missing Number
                Given an array nums containing n distinct numbers in the range [0, n], return the only number
                in the range that is missing from the array.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i + " : ");
            nums[i] = scanner.nextInt();
        }
        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + missingNumber(nums));
        scanner.close();
    }

    public static int missingNumber(int[] nums) {
        // variables to store the total number of elements and the sum of the elements
        int i, numTotal=0, numSumTotal=0;
        // loop to calculate the sum of the elements and the total number of elements
        for (i=0; i<nums.length ;i++){
            numSumTotal+=nums[i];
            numTotal+=i+1;
        }
        // return the difference between the total number of elements and the sum of the elements
        return numTotal-numSumTotal;
    }
}
