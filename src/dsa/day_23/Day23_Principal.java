package src.dsa.day_23;

import java.util.Arrays;
import java.util.Scanner;

public class Day23_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 23: Search in Rotated Sorted Array
                There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
                Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
                For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
                Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
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
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        sc.close();
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int left=0, right=nums.length-1;

        while(left<=right){
            int mid= (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
