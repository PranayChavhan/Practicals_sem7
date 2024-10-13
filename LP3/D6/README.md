# QuickSort Algorithm (Deterministic and Randomized)

This program implements two variants of the QuickSort algorithm:
1. **Deterministic QuickSort**: Uses the last element as the pivot for partitioning.
2. **Randomized QuickSort**: Randomly selects a pivot for partitioning to prevent the worst-case time complexity in specific input cases (like sorted or reverse-sorted arrays).

## Overview of the Program

The QuickSort algorithm recursively divides the array around a pivot and sorts each half. In this program:
- The **deterministic version** always picks the last element as the pivot.
- The **randomized version** selects a pivot randomly to optimize against worst-case scenarios.

The program measures and compares the time taken by both versions on arrays of different sizes.

### How it Works:
1. **Partition**: The `deterministicPartition` selects the last element as the pivot, rearranging the array so that elements smaller than the pivot come before it and elements larger come after.
2. **Randomized Partition**: `randomizedPartition` selects a pivot randomly, swaps it with the last element, and then proceeds with the partitioning.
3. **Recursion**: The `quickSort` function is called recursively on the sub-arrays, sorting each portion until the entire array is sorted.

## Dry Run

For an array: `[10, 80, 30, 90, 40, 50, 70]`, let's consider a **deterministic** quicksort.

1. **First Call**: Pivot is 70 (last element). Partition arranges array as `[10, 30, 40, 50, 70, 90, 80]`, pivot index is 4.
2. **Second Call**: Sub-arrays are `[10, 30, 40, 50]` and `[90, 80]`. Repeat for both sub-arrays.
3. **Further Calls**: The process continues recursively until all elements are sorted.

## Time Complexity (TC)

1. **Best and Average Case**: O(N log N)  
   When the pivot divides the array approximately in half, the algorithm performs at its best.
   
2. **Worst Case**: O(N²)  
   In the worst case (like already sorted arrays in deterministic QuickSort), the pivot does not divide the array evenly, leading to quadratic time complexity.

## Space Complexity (SC)

1. **Space Complexity**: O(log N)  
   This is due to the recursive nature of the algorithm. For an in-place sort, additional space usage mainly comes from the recursion stack, which in the best and average cases is proportional to log N.
   
   In the worst case, the recursion depth could be O(N), resulting in higher memory usage.

## Conclusion

- **Deterministic QuickSort** is simple and efficient for most inputs but may suffer from poor performance on sorted or nearly sorted arrays.
- **Randomized QuickSort** improves performance by minimizing the chances of hitting worst-case time complexity.
