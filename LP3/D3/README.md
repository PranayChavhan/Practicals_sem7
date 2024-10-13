# Fractional Knapsack Problem

This program solves the Fractional Knapsack Problem using a greedy approach. The fractional knapsack problem allows us to take fractions of items rather than requiring the whole item, which is useful in scenarios where items can be broken down into smaller parts.

## Overview of Code

The program defines an `Item` class to represent each item with its profit and weight. The `FractionalKnapsack` class contains methods to sort the items based on their profit-to-weight ratio and compute the maximum value that can be carried in the knapsack. 

1. **Input**: The program takes the number of items, profit and weight of each item, and the capacity of the knapsack.
2. **Sorting**: It sorts the items by their profit-to-weight ratio in descending order.
3. **Maximizing Profit**: It iterates through the sorted items, adding them to the knapsack until the capacity is reached. If the entire item cannot be added, it adds the fraction that fits.

## Dry Run Example

Let's perform a dry run for the input:

### Input
Number of items: 3 
Item 1: Profit = 60, Weight = 10 
Item 2: Profit = 100, Weight = 20 
Item 3: Profit = 120, Weight = 30 
Capacity of knapsack: 50


### Step 1: Sort Items by Profit-to-Weight Ratio
- Items before sorting:
  - Item 1: Profit = 60, Weight = 10 (Profit/Weight = 6)
  - Item 2: Profit = 100, Weight = 20 (Profit/Weight = 5)
  - Item 3: Profit = 120, Weight = 30 (Profit/Weight = 4)

- Sorted Items:
  1. Item 1: Profit = 60, Weight = 10
  2. Item 2: Profit = 100, Weight = 20
  3. Item 3: Profit = 120, Weight = 30

### Step 2: Maximize Profit
- Starting with capacity = 50.
  1. `Add Item 1 (10 kg, 60 profit):`
     -` Remaining Capacity: 50 - 10 = 40`
     - `Total Profit: 60`
  2. Add Item 2 (20 kg, 100 profit):
     - Remaining Capacity: 40 - 20 = 20
     - Total Profit: 160
  3. Add Item 3 (30 kg, 120 profit):
     - Can only take 20 kg of this item, contributing:
     - Profit contribution: 120 * (20 / 30) = 80
     - Total Profit: 240

### Final Output
Maximum value in knapsack: 240.0
