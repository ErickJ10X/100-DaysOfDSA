package src.dsa.day_2;

import java.util.Scanner;

public class Day2_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 2: Roman to Integer
                Given an integer n, return true if it is a power of two. Otherwise, return false.
                An integer n is a power of two, if there exists an integer x such that n == 2^x.
                """;

        // Print the problem and ask for the input
        Scanner scanner = new Scanner(System.in);
        System.out.println(textProblem);
        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();

        // Print the output
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + isPowerOfTwo(n));
        System.out.println("Output: " + isPowerOfTwo2(n));
    }

    public static boolean isPowerOfTwo(int n) {

        // Check if the number is 1
        if (n == 1) {
            return true;
        }

        // Check if the number is negative or odd number
        if (n <= 0 || (n%2 != 0)) {
            return false;
        }

        // Check if the number is a power of two
        for (int i = 0; i < n; i++) {
            if (Math.pow(2, i) == n ) {
                return true;
            }
        }

        // If the number is not a power of two
        return false;
    }

    public static boolean isPowerOfTwo2(int n){
        if (n==1){
            return true;
        }
        if (n <= 0 || (n%2 != 0)) {
            return false;
        }
        var exponente = Math.log(n)/Math.log(2);
        return Math.pow(2,exponente)==n;
    }
}

