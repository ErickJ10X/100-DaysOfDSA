package src.dsa.day_11;

import java.util.Arrays;
import java.util.Scanner;

public class Day11_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 11: Remove Element
                Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
                Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
                Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
                Return k.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i + " : ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to remove: ");
        int val = scanner.nextInt();
        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", val = " + val);
        System.out.println("Output: " + removeElement(nums, val));
        scanner.close();
    }

    public static int removeElement(int[] nums, int val) {
        int c=0,i;
        for(i=0 ; i < nums.length ; i++){
            if ( nums[i] != val ){
                nums[c]=nums[i];
                c++;
            }
        }
        return  c;
    }
}
