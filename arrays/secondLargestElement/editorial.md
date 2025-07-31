# Day 1: Find the Second Largest Element

## Methods

### 1. Sorting and Returning the Second Last Distinct Element

Sort the array in ascending order and then iterate from the end to find the second last distinct element.

- **Time Complexity**: O(n log n)
- **Space Complexity**: O(1)

### 2. Two Iterations Method

First complete one full iteration to find the maximum element. In a second pass, look for the highest value that is less
than the maximum found in the first pass.

- **Time Complexity**: O(2n) ≈ O(n)
- **Space Complexity**: O(1)

### 3. Single Pass with Two Variables

Maintain two variables, `max` and `secondMax`. Update these as you iterate through the array only once.
Ensure `secondMax` tracks the second-largest distinct number seen so far.

- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
