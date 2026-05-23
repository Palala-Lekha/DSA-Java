/*
Problem: Remove Element from Array

Description:
Remove all occurrences of a given value from the array
in-place and return the number of remaining elements.

Approach:
1. Traverse the array
2. Move elements not equal to val to the front
3. Keep count using variable k
4. Return k as the number of valid elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        // Move all elements not equal to val to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input value to remove
        int val = sc.nextInt();

        // Call function
        int result = removeElement(nums, val);

        // Print result
        System.out.println(result);

        sc.close();
    }
}