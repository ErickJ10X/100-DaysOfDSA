package src.dsa.day_25;

import java.util.Arrays;
import java.util.Scanner;

public class Day25_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 25: Find Peak Element
                A peak element is an element that is strictly greater than its neighbors.
                Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
                You must write an algorithm that runs in O(log n) time.
                """;
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
        System.out.println("Output: " + findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
