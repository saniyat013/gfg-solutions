
# Day 2: Move All Zeros to End

## Methods

### 1. Using a Temporary Array

Create a temporary array of the same size as the input array. Traverse the input array, copying all non-zero elements into the temporary array. Fill the remaining positions of the temp array with zeros.

-   **Time Complexity**: O(n)
-   **Space Complexity**: O(n)

### 2. Two Pointers Approach (Overwrite and Fill)

Initialize two pointers; `count` starting at the beginning of the array. As we iterate through the array with another pointer `i`, keep `count` at the last non-zero found. If a non-zero is encountered, place it at the `arr[count]` and increment `count`. After the loop, fill the remainder of the array from `count` to end with zeros.

-   **Time Complexity**: O(n)
-   **Space Complexity**: O(1)

### 3. Two Pointers Approach (Swap)

Similar to the previous method but instead of just placing the non-zero value and filling later, swap the values immediately when a non-zero element is encountered. This keeps all non-zeros packed to the start from index `0` to `count - 1`.

-   **Time Complexity**: O(n)
-   **Space Complexity**: O(1)
