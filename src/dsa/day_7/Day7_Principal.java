package src.dsa.day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day7_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 7: Add to Array-Form of Integer
                The array-form of an integer num is an array representing its digits in left to right order.
                For example, for num = 1321, the array form is [1,3,2,1].
                Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
                """;
        // Print the problem and ask for the input
        Scanner scanner = new Scanner(System.in);
        System.out.println(textProblem);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i + " : ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the number k: ");
        int m = scanner.nextInt();

        // Print the output
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + m);
        System.out.println("Output: " + addToArrayForm(nums, m));
        scanner.close();
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        // Create a list to store the result
        List<Integer> result = new ArrayList<>();
        // Iterate the array from the end
        int i = num.length - 1;
        // Iterate the array and the number k
        while (i >= 0 || k > 0) {
            // If the index is greater than 0, add the number to k
            if (i >= 0) {
                k += num[i];
            }
            // Add the number to the list
            result.add(0, k % 10);
            k /= 10;
            i--;
        }
        return result;
    }
}
