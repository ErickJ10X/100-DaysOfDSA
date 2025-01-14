package src.dsa.day_3;

import java.util.Scanner;

public class Day3_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 3: Fibonacci Number
                The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
                F(0) = 0, F(1) = 1
                F(n) = F(n - 1) + F(n - 2), for n > 1.
                Given n, calculate F(n).
                """;

        // Print the problem and ask for the input
        Scanner scanner = new Scanner(System.in);
        System.out.println(textProblem);
        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();

        // Print the output
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + fib(n));
        System.out.println("Output: " + fib(n));
    }
    public static int fib(int n){

        // Check if the number is 1
        if ( n == 1 ){
            return 1;
        }

        // Check if the number is 0
        if ( n == 0 ){
            return 0;
        }

        // return the sum of the two preceding ones
        return fib( n - 1 ) + fib( n - 2);
    }
}
