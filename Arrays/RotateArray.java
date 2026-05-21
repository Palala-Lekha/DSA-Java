/*
Problem: Rotate Array

Description:
Rotate the array by k positions using the Reversal Algorithm.

Approach:
1. Reverse the entire array
2. Reverse first k elements
3. Reverse remaining elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input size of array
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input rotation count
        int k = scanner.nextInt();

        rotate(k, arr);

        // Print rotated array
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        scanner.close();
    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int k, int[] arr) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
    }
}