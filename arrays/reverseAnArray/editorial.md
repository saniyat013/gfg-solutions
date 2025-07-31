# Day 3: Reverse an Array

## Methods

### 1. Using a Temporary Array

Create a temporary array of the same size as the input array. Iterate from the end of the original array and fill the
temporary array from the beginning.

- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 2. In-Place Swapping

Iterate over the first half of the array and swap each element with its corresponding element from the end. For any
element at index `i`, swap it with the element at index `(n - i - 1)`.

- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

### 3. Two Pointers Approach

Initialize two pointers; one starting at the beginning (`start`) and another at the end (`end`) of the array. Swap the
elements at these pointers and move them towards each other until they meet or cross.

- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
