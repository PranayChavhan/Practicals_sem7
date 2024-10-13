
 # Fibonacci Calculator

 This Java program demonstrates two approaches to calculate Fibonacci numbers:
 1. **Iterative (Non-Recursive)** approach
 2. **Recursive** approach

 ## Explanation

 ### Fibonacci Series:
 The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones. The series starts as:
 ```
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 ```
 Where:
 - F(0) = 0
 - F(1) = 1
 - F(n) = F(n-1) + F(n-2) for n ≥ 2

 ### Program Structure:
 - **Iterative Approach:** This approach uses a loop to compute the Fibonacci number. It has a time complexity of O(n) and space complexity of O(1).
 - **Recursive Approach:** This approach uses recursion to compute the Fibonacci number, leading to exponential time complexity O(2^n) and space complexity O(n) due to the recursion stack.

 ### Methods in the Program:
 1. **fibonacciIterative(int n)**: Computes Fibonacci using a loop.
 2. **fibonacciRecursive(int n)**: Computes Fibonacci using recursion.

 ---

 ## Test Cases

 ### Test Case 1:
 **Input:** `n = 5`
 **Expected Output:**
 - Iterative: `5`
 - Recursive: `5`

 ### Test Case 2:
 **Input:** `n = 10`
 **Expected Output:**
 - Iterative: `55`
 - Recursive: `55`

 ### Test Case 3:
 **Input:** `n = 0`
 **Expected Output:**
 - Iterative: `0`
 - Recursive: `0`

 ### Test Case 4:
 **Input:** `n = 1`
 **Expected Output:**
 - Iterative: `1`
 - Recursive: `1`

 ---

 ## Dry Run

 ### Iterative Approach Dry Run for `n = 5`

 | Iteration | `a` (previous) | `b` (current) | `c` (next)  |
 |-----------|----------------|---------------|-------------|
 | Initial   | 0              | 1             | -           |
 | 1st       | 1              | 1             | 1           |
 | 2nd       | 1              | 2             | 2           |
 | 3rd       | 2              | 3             | 3           |
 | 4th       | 3              | 5             | 5           |

 **Output:** `5`

 ---

 ### Recursive Approach Dry Run for `n = 5`

 **Recursive Tree:**
 ```
 fibonacciRecursive(5)
    |
    |__ fibonacciRecursive(4)
         |
         |__ fibonacciRecursive(3)
              |
              |__ fibonacciRecursive(2) -> 1
              |__ fibonacciRecursive(1) -> 1
         |
         |__ fibonacciRecursive(2) -> 1
    |
    |__ fibonacciRecursive(3)
         |
         |__ fibonacciRecursive(2) -> 1
         |__ fibonacciRecursive(1) -> 1
 ```

 **Output:** `5`

 ---

 ## Time and Space Complexity

 ### Iterative Approach:
 - **Time Complexity:** O(n)
   Since we use a loop that runs `n-1` times.

 - **Space Complexity:** O(1)
   Only a constant amount of memory is used for variables `a`, `b`, and `c`.

 ### Recursive Approach:
 - **Time Complexity:** O(2^n)
   Each function call results in two further recursive calls, creating an exponential growth of calls.

 - **Space Complexity:** O(n)
   The depth of the recursion stack can go up to `n`.

 ---
