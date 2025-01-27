package src.dsa.day_16;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 16: Largest Number At Least Twice of Others
                You are given an integer array nums where the largest integer is unique.
                Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums));
        System.out.println("Output: " + dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int i, index=0, n= nums.length;
        for (i=0;i<n;i++){
            if (nums[i]>nums[index]){
                index=i;
            }
        }
        for (int num : nums){
            if (num<nums[index]){
                if(num*2 <= nums[index]){
                    continue;
                }else{
                    return-1;
                }
            }
        }
        return index;
    }
}
