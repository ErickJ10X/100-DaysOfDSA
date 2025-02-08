package src.dsa.day_27;

import java.util.Arrays;
import java.util.Scanner;

public class Day27_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 27: Single Element in a Sorted Array
                You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
                You must write an algorithm with O(log n) runtime complexity.""";
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
        System.out.println("Output: " + singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}
