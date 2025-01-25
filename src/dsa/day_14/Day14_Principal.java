package src.dsa.day_14;

import java.util.Arrays;
import java.util.Scanner;

public class Day14_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 14: Product of Array Except Self
                Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
                The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
                You must write an algorithm that runs in O(n) time and uses constant extra space.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        // variables
        int n = nums.length;
        int l = 1, r = 1;
        int[] result = new int[n];
        // Left product
        for (int i = 0; i < n; i++) {
            result[i] = l;
            l *= nums[i];
        }
        // Right product
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= r;
            r *= nums[i];
        }
        return result;
    }
}
