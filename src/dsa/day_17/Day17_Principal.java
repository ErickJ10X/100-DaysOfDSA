package src.dsa.day_17;

import java.util.Arrays;
import java.util.Scanner;

public class Day17_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 17: Container With Most Water
                You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
                Find two lines that together with the x-axis form a container, such that the container contains the most water.
                Return the maximum amount of water a container can store.
                Notice that you may not slant the container.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        sc.close();
        // Print the output
        System.out.println("Input: height = " + Arrays.toString(height));
        System.out.println("Output: " + maxArea(height));
    }
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0, h,area;
        while (left < right) {
            h = (height[left] < height[right]) ? height[left] : height[right];
            area = h * (right - left);
            maxArea = maxArea > area ? maxArea : area;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
