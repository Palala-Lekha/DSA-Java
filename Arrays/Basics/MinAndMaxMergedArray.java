/*
Problem: Find Minimum and Maximum in Merged Array

Description:
Read two arrays as input, merge them into a single array,
and find the minimum and maximum elements in the merged array.

Approach:
1. Take two array inputs as strings
2. Split the inputs using spaces
3. Create a merged array
4. Copy elements from both arrays into merged array
5. Traverse the merged array
6. Find minimum and maximum values

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

import java.util.Scanner;

public class MinAndMaxMergedArray {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input arrays
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");

        // Create merged array
        int[] arr = new int[input1.length + input2.length];

        // Copy elements from first array
        for (int i = 0; i < input1.length; i++) {
            arr[i] = Integer.parseInt(input1[i]);
        }

        // Copy elements from second array
        for (int i = 0; i < input2.length; i++) {
            arr[input1.length + i] = Integer.parseInt(input2[i]);
        }

        // Print merged array
        System.out.print("Merged Array: [");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Find minimum and maximum values
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print minimum and maximum values
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Close scanner
        sc.close();
    }
}