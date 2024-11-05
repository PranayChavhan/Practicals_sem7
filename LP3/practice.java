import java.util.Scanner;

class Item{
    int profit;
    int weight;

    public Item(int profit, int weight){
        this.profit = profit;
        this.weight = weight;
    }
}

public class practice{

    public static int knapsack(int capacity, Item[] items, int n){

        int[][] dp = new int[n + 1][capacity + 1];

        // Build the DP table
        for(int i = 0; i <= n; i++){
            for(int w = 0; w <= capacity; w++){

                // Base case: no items or capacity is 0
                if(i == 0 || w == 0){
                    dp[i][w] = 0;
                }else if(items[i - 1].weight <= w){
                    // Include or exclude the item, whichever is more profitable

                    // dp[i][w] = Math.max(
                    //     items[i - 1].profit + dp[i - 1][w - items[i - 1].weight],
                    //     dp[i - 1][w]
                    // );

                    dp[i][w] = Math.max(
                        items[i - 1].profit + dp[i - 1][w - items[i - 1].weight],
                        dp[i - 1][w]
                    );
                }else{

                    // Excude the item
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter profit of item " + (i + 1) + ": ");
            int profit = sc.nextInt();

            System.out.println("Enter weight of item " + (i + 1) + ": ");
            int weight = sc.nextInt();

            items[i] = new Item(profit, weight);
        }

        System.out.println("Enter capacity of knapsack: ");
        int capacity = sc.nextInt();

        System.out.println("Maximum value in knapsack: " + knapsack(capacity, items, n));

        sc.close();
    }
}