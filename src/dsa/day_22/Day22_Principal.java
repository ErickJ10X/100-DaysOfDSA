package src.dsa.day_22;

import java.util.Arrays;
import java.util.Scanner;

public class Day22_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 22: Find First and Last Position of Element in Sorted Array
                Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
                If target is not found in the array, return [-1, -1].
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
        System.out.println("Output: " + Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        int left=0,right=nums.length-1;
        while(left<=right){
            if(nums[left]==target){
                result[0]=left;
            }else{
                left++;
            }
            if(nums[right]==target){
                result[1]=right;
            }else{
                right--;
            }
            if (result[0]!=-1 && result[1]!=-1){
                break;
            }
        }
        return result;
    }
}
