package src.dsa.day_5;

import java.util.Scanner;

public class Day5_Principal {
    public static void main(String[] args) {
        // Problem
        String textProblem = """
                Day 5: Water Bottles
                There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
                The operation of drinking a full water bottle turns it into an empty bottle.
                Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
                """;

        // Print the problem and ask for the input
        Scanner scanner = new Scanner(System.in);
        System.out.println(textProblem);
        System.out.println("Enter the number num Bottles: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number Exchange: ");
        int m = scanner.nextInt();

        // Print the output
        System.out.println("Input: n = " + n + ", m = " + m);
        System.out.println("Output: " + numWaterBottles(n, m));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        // Initialize the variables
        var emptyBottles = numBottles;

        // Loop through the numbers and calculate number of empty bottles
        while (numBottles >= numExchange){

            // Calculate the number of empty bottles
            emptyBottles += ( numBottles / numExchange );

            // Calculate the number of remaining bottles
            numBottles = ( numBottles / numExchange ) + ( numBottles % numExchange );
        }
        return emptyBottles;
    }
}
