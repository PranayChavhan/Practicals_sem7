package LP3.D3;

import java.util.*;

class Item {
    double profit;
    double weight;

    public Item(double profit, double weight) {
        this.profit = profit;
        this.weight = weight;
    }
}

public class Main {

    public static double fractionalKnapsack(double capacity, Item[] items) {
        // Sort items by profit-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.profit / b.weight, a.profit / a.weight));

        double finalValue = 0.0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                finalValue += item.profit;
                capacity -= item.weight;
            } else {
                finalValue += item.profit * (capacity / item.weight);
                break;
            }
        }
        return finalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();
        Item[] items = new Item[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit of item " + (i + 1) + ": ");
            double profit = scanner.nextDouble();
            System.out.print("Enter weight of item " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            items[i] = new Item(profit, weight);
        }
        
        System.out.print("Enter capacity of knapsack: ");
        double capacity = scanner.nextDouble();
        
        System.out.println("Maximum value in knapsack: " + fractionalKnapsack(capacity, items));
        
        scanner.close();
    }
}
