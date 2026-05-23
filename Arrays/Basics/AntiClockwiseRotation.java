/*
Problem: Anti-Clockwise Rotation of Array by One Position

Description:
Rotate the array one position to the left
(anti-clockwise rotation).

Approach:
1. Store the first element in a temporary variable
2. Shift all elements one position to the left
3. Place the first element at the end of the array

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class AntiClockwiseRotation {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Store first element
        int temp = nums[0];

        // Shift elements to the left
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }

        // Place first element at the end
        nums[n - 1] = temp;

        // Print rotated array
        System.out.print("Array after anti-clockwise rotation: [");

        for (int i = 0; i < n; i++) {

            System.out.print(nums[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Close scanner
        sc.close();
    }
}