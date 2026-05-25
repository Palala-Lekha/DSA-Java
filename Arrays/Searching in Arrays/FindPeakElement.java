/*
Problem: Find Peak Element

Description:
Find the index of a peak element in the array.
A peak element is greater than its adjacent elements.

Approach:
1. Check if the first element is a peak
2. Traverse middle elements
3. Check if current element is greater than both neighbors
4. Check if the last element is a peak
5. Return the index of the peak element

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class FindPeakElement {

    // Function to find peak element index
    static int findPeakElement(int[] nums) {

        int n = nums.length;

        // Check first element
        if (n == 1 || nums[0] > nums[1]) {
            return 0;
        }

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {

            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        // Check last element
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input size of array
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Print peak element index
        System.out.println(findPeakElement(nums));

        // Close scanner
        scanner.close();
    }
}