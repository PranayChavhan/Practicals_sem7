package LP3.D4;

import java.util.*;

public class Main {

    public static int[] knapsack_01(int n, int[] values, int[] weights, int W) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        List<Integer> selectedItems = new ArrayList<>();
        int i = n, w = W;
        while (i > 0 && w > 0) {
            if (dp[i][w] != dp[i - 1][w]) {
                selectedItems.add(i - 1);
                w -= weights[i - 1];
            }
            i--;
        }

        return new int[] {dp[n][W], selectedItems.size()};
    }

    public static void main(String[] args) {
        int n = 3;
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;

        int[] result = knapsack_01(n, values, weights, W);
        System.out.println();
        System.out.println("Maximum value: " + result[0]);
        System.out.print("Selected items: ");
        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
