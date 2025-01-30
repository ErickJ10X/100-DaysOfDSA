package src.dsa.day_18;

import java.util.Arrays;
import java.util.Scanner;

public class Day18_Principal {
    public static void main(String[] args) {
        //Problem 1
        String textProblem = """
                Day 18: Increasing Triplet Subsequence
                Given an integer array nums, return true if there exists a triple of indices (i, j, k)
                such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.""";
        //print the problem statement
        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        //print the output
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + increasingTriplet(nums));
        sc.close();
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
