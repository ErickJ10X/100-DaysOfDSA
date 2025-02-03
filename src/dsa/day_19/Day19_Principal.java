package src.dsa.day_19;

import java.util.Arrays;
import java.util.Scanner;

public class Day19_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 19: Maximum Ascending Subarray Sum
                Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
                A subarray is defined as a contiguous sequence of numbers in an array.
                A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.""";

        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int currentMaxSum = nums[0], maxSum = 0, i;
        for (i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                if(currentMaxSum > maxSum){
                    maxSum = currentMaxSum;
                }
                currentMaxSum = 0;
            }
            currentMaxSum += nums[i];
        }
        if (currentMaxSum > maxSum){
            return currentMaxSum;
        }else{
            return maxSum;
        }
    }
}
