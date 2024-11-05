package D4;

import java.util.Scanner;

class Item {
    int profit;
    int weight;

    public Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
    }
}

public class Main {

    public static int knapsack(int capacity, Item[] items, int n) {
        // Create a table to store results of subproblems
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the table dp[][] in a bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0; // Base case: no items or capacity is 0
                } else if (items[i - 1].weight <= w) {
                    // Include the item or exclude it, whichever is more profitable
                    dp[i][w] = Math.max(items[i - 1].profit + dp[i - 1][w - items[i - 1].weight], dp[i - 1][w]);
                } else {
                    // Exclude the item
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Return the maximum profit that can be achieved
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit of item " + (i + 1) + ": ");
            int profit = scanner.nextInt();
            System.out.print("Enter weight of item " + (i + 1) + ": ");
            int weight = scanner.nextInt();
            items[i] = new Item(profit, weight);
        }

        System.out.print("Enter capacity of knapsack: ");
        int capacity = scanner.nextInt();

        System.out.println("Maximum value in knapsack: " + knapsack(capacity, items, n));

        scanner.close();
    }
}

// Enter number of items: 3
// Enter profit of item 1: 60
// Enter weight of item 1: 10
// Enter profit of item 2: 100
// Enter weight of item 2: 20
// Enter profit of item 3: 120
// Enter weight of item 3: 30
// Enter capacity of knapsack: 50
// Maximum value in knapsack: 220