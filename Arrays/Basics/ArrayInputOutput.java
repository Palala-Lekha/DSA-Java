/*
Problem: Array Input and Output

Description:
Read n elements into an array and print all elements.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class ArrayInputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}