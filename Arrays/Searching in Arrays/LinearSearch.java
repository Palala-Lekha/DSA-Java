/*
Problem: Linear Search

Description:
Search for a given element in an array using
Linear Search technique.

Approach:
1. Traverse the array from beginning to end
2. Compare each element with the key
3. If element is found, return its index
4. Otherwise return -1

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class LinearSearch {

    // Function for linear search
    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the size of the array:");

        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.println("Enter the element to search:");

        int key = sc.nextInt();

        // Call linear search function
        int result = linearSearch(arr, key);

        // Print result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        // Close scanner
        sc.close();
    }
}