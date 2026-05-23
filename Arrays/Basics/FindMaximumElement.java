/*
Problem: Find Maximum Element in an Array

Description:
Read array elements and find the maximum element present in the array.

Approach:
Traverse the array and continuously update the maximum value.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class FindMaximumElement {

    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("Array: [");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        System.out.println("Maximum value : " + max);

        sc.close();
    }
}