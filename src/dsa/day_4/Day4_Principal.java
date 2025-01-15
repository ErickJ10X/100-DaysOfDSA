package src.dsa.day_4;

import java.util.Scanner;

public class Day4_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 4: Tribonacci Number
                The Tribonacci sequence Tn is defined as follows:
                T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
                Given n, return the value of Tn.
                """;

        // Print the problem and ask for the input
        Scanner scanner = new Scanner(System.in);
        System.out.println(textProblem);
        System.out.println("Enter the number n: ");
        int n = scanner.nextInt();

        // Print the output
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + tribonacci(n));
        System.out.println("Output: " + tribonacci2(n));
    }

    public static int tribonacci(int n){

        // Check if the number is 0 or negative
        if (n==0 || n<0) return 0;

        // Check if the number is 1 or 2
        if (n==1 || n==2) return 1;

        // return the sum of the three preceding ones
        return tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
    }

    public static int tribonacci2(int n){
        // Check if the number is 0 or negative
        if (n == 0 || n<0) return 0;

        // Check if the number is 1 or 2
        if (n == 1 || n == 2) return 1;

        // Initialize the variables
        int a = 0, b = 1, c = 1, d = 0;

        // Loop through the numbers and calculate the sum of the three preceding ones to
        // generate the next number in the Tribonacci sequence.
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        // return the value of Tribonacci n
        return d;
    }
}
