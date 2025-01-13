package src.dsa.day_1;

import java.util.Scanner;

public class Day1_Principal {

    public static void main(String[] args) {

        // Problem
        String textProblem = """
                Day 1: Palindrome Number
                Given an integer x, return true if x is a palindrome, and false otherwise.
                range: -231 <= x <= 230
                """;

        // Print the problem and ask for the input
        Scanner scanner = new Scanner(System.in);
        System.out.println(textProblem);
        System.out.println("Enter the number x: ");
        int x = scanner.nextInt();

        // Print the output
        System.out.println("Input: x = " + x);
        System.out.println("Output: " + isPalindrome(x));

        scanner.close();
    }

    public static boolean isPalindrome(int x) {

        // Check if the number is negative or out of range
        if (x < 0 || !( x < 230 )) {
            return false;
        }

        // Cast int to string
        var numString = Integer.toString(x);

        // Reverse the string
        var reverse = new StringBuilder(numString).reverse().toString();

        // Compare the string with the reverse
        return numString.equals(reverse);
    }
}
