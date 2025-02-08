package src.dsa.day_26;

import java.util.Arrays;
import java.util.Scanner;

public class Day26_Principal {
    public static void main(String[] args) {
        String textProblem = """
                Day 26: Search Insert Position
                Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
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
        System.out.println("Output: " + searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int index=0,ant=nums[0];
        for (int i : nums){
            if(i == target || target < i ){
                return index;
            }
            if (ant<target){
                ant=i;
            }else {
                return index-1;
            }
            index++;
        }
        return index;
    }
}