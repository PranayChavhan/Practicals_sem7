# 0-1 Knapsack Problem

This program solves the 0-1 Knapsack problem using dynamic programming. In this problem, each item can either be included in the knapsack or excluded, and the goal is to maximize the total value without exceeding the knapsack's capacity.

## Overview of Program

The program defines a `knapsack_01` method that accepts the number of items, their values, their weights, and the maximum capacity of the knapsack. It uses a 2D array (`dp`) to store the maximum value that can be obtained for each combination of items and weights.

### Steps:
1. **Initialization**: Create a 2D array to hold the maximum value for each item up to the maximum weight.
2. **Dynamic Programming Table Filling**: Iterate through each item and weight to determine the optimal value:
   - If the item can fit in the knapsack, compare the value of including the item vs. excluding it.
   - If it cannot fit, carry forward the value from the previous item.
3. **Backtrack to Find Selected Items**: After calculating the maximum value, backtrack to find which items were included in the optimal solution.

## Dry Run Example

Let's perform a dry run for the input:

### Input
- Number of items: 3 
- Values: [60, 100, 120] 
- Weights: [10, 20, 30] 
- Capacity of knapsack: 50


### Step 1: Initialize the DP Table
- Create a table `dp` of size `(n+1) x (W+1)` filled with zeros.

### Step 2: Fill the DP Table
- For each item and weight, compute the maximum value:
  - For item 1 (weight 10, value 60):
    - Fill the values for capacities 10 to 50.
  - For item 2 (weight 20, value 100):
    - Fill the values for capacities 20 to 50, considering both item 1 and item 2.
  - For item 3 (weight 30, value 120):
    - Fill the values for capacities 30 to 50, considering all three items.

### Step 3: Backtrack to Find Selected Items
- Start from `dp[3][50]` and check if the item was included by comparing it with the previous row's value.

### Final Output
Maximum value: 220 Selected items: 2


## Time Complexity (TC)
The time complexity of the algorithm is **O(n * W)**, where `n` is the number of items and `W` is the maximum capacity of the knapsack. This is due to the nested loops that fill the DP table.

## Space Complexity (SC)
The space complexity is also **O(n * W)** because we use a 2D array of size `(n+1) x (W+1)` to store the results of subproblems. If we optimize the solution, we can reduce the space complexity to **O(W)** by using a 1D array, but this implementation uses a 2D array for clarity.
