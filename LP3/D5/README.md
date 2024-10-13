# N-Queens Problem (Backtracking Solution)

This program solves the N-Queens problem using a backtracking approach. The N-Queens problem involves placing N queens on an N x N chessboard in such a way that no two queens threaten each other. The solution involves placing queens row by row and ensuring that no queen is placed in a position where it can attack another queen based on the rules of chess.

## Overview

The program is implemented in Java and solves the problem for a 6x6 chessboard. The `nqueen` function recursively tries to place queens row by row, backtracking if a safe position is not found. The `isSafe` function checks if placing a queen at a particular row and column is safe, ensuring that no other queens are in the same row, column, or diagonal.

## Code Workflow

1. **Board Initialization**: A 6x6 chessboard is created, initialized with `_` to represent empty spaces.
2. **Recursive Backtracking**: The program attempts to place queens on the board row by row. If a valid configuration is found, the board is printed.
3. **Safe Check**: The `isSafe` function ensures that no queen is placed where it can attack another queen horizontally, vertically, or diagonally.

## Dry Run Example

Let’s walk through a dry run of the program for a smaller board (4x4) to demonstrate the process:

### Input
Board size = 4x4


### Step-by-Step Execution:
1. Start placing queens in the first row.
2. Place queen in the first row, first column (`Q` at position (0, 0)).
3. Move to the second row:
   - (1, 0) is not safe (same column).
   - (1, 1) is not safe (same diagonal).
   - (1, 2) is safe; place `Q` at (1, 2).
4. Move to the third row:
   - Try each column and check safety.
   - Continue placing queens row by row.
5. Once a valid arrangement is found for all rows, print the board.

### Output for 4x4:
``` 
_Q__
___Q
Q___
__Q_
---------------------------------
__Q_
Q___
___Q
_Q__
```
