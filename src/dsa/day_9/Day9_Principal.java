package src.dsa.day_9;

import java.util.Arrays;
import java.util.Scanner;

public class Day9_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 9: Median of Two Sorted Arrays
                Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
                The overall run time complexity should be O(log (m+n)).
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array: ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the element " + i + " : ");
            nums1[i] = scanner.nextInt();
        }
        System.out.println("Enter the number of elements in the second array: ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i + " : ");
            nums2[i] = scanner.nextInt();
        }
        // Print the output
        System.out.println("Input: nums1 = " + Arrays.toString(nums1) + ", nums2 = " + Arrays.toString(nums2));
        System.out.println("Output: " + findMedianSortedArrays(nums1, nums2));
        scanner.close();
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // variables to store the result, length of the arrays and a new array
        double result;
        int a=nums1.length, b=nums2.length,i;
        int[] num;
        // if the length of the arrays is 0
        if (a==0){
            if(b%2==0){
                result = nums2[(b/2)-1] + nums2[b/2];
                return result/2;
            }else{
                result = nums2[b/2];
                return result;
            }
        }else if (b==0){
            if(a%2==0){
                result = nums1[(a/2)-1] + nums1[a/2];
                return result/2;
            }else{
                result = nums1[a/2];
                return result;
            }
        }
        // create a new array with the length of the sum of the lengths of the two arrays
        num = new int[a + b];
        int index1 = 0, index2 = 0;
        // merge the two arrays
        for (i = 0; i < (a + b); i++) {
            if (index1 < a && (index2 >= b || nums1[index1] < nums2[index2])) {
                num[i] = nums1[index1];
                index1++;
            } else {
                num[i] = nums2[index2];
                index2++;
            }
        }
        // if the sum of the lengths of the two arrays is even
        if ( ((a + b) % 2 == 0) ){
            // return the average of the two middle elements
            result = num[(num.length/2)-1]+num[num.length/2];
        }else{
            // return the middle element
            result = num[(num.length/2)];
            return result;
        }
        return result/2;
    }
}
