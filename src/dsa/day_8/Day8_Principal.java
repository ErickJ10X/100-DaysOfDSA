package src.dsa.day_8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 7: Maximum Product of Two Elements in an Array
                Given the array of integers nums, you will choose two different indices i and j of that array.
                Return the maximum value of (nums[i]-1)*(nums[j]-1).
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
        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + maxProduct(nums));
        scanner.close();
    }

    public static int maxProduct(int[] nums) {
        int i = 0, j = 0, k;
        for (k = 0; k < nums.length; k++) {
            if (nums[k] > nums[i]) {
                j = i;
                i = k;
            } else if (nums[k] > nums[j]) {
                j = k;
            }
        }
        return (nums[i] - 1) * (nums[j] - 1);
    }
}
