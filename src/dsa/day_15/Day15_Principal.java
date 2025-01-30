package src.dsa.day_15;

import java.util.Scanner;

public class Day15_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 15: Bulb Switcher
                There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
                On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
                Return the number of bulbs that are on after n rounds.
                """;
        // Print the problem and ask for the input
        System.out.println(textProblem);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bulbs: ");
        int n = sc.nextInt();
        sc.close();
        // Print the output
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + bulbSwitch(n));
    }

    public static int bulbSwitch(int n) {
        // The number of bulbs that are on after n rounds is the number of perfect squares less than or equal to n
        return (int) Math.sqrt(n);
    }
}
