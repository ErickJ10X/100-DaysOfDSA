package src.dsa.day_24;

import java.util.Arrays;
import java.util.Scanner;

public class Day24_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 24: Find Minimum in Rotated Sorted Array
                Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
                [4,5,6,7,0,1,2] if it was rotated 4 times.
                [0,1,2,4,5,6,7] if it was rotated 7 times.
                Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
                Given the sorted rotated array nums of unique elements, return the minimum element of this array.
                You must write an algorithm that runs in O(log n) time.""";
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
        System.out.println("Output: " + findMin(nums));
    }
    public static int findMin(int[] nums) {
        int left=0, right=nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}
