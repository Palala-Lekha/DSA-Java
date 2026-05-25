/*
Problem: Finding the Highest Sales in Multiple Regions

Description:
Read sales values from the user and
find the highest sales value in the array.

Approach:
1. Store sales values in an array
2. Assume the first element as maximum
3. Traverse the array
4. Update maximum whenever a larger element is found

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class MaximumSales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        int[] sales = new int[n];

        // Input sales values
        for (int i = 0; i < sales.length; i++) {
            sales[i] = sc.nextInt();
        }

        // Assume first element as maximum
        int max = sales[0];

        // Find maximum sales value
        for (int i = 1; i < sales.length; i++) {

            if (sales[i] > max) {
                max = sales[i];
            }
        }

        // Print maximum sales value
        System.out.println("Maximum Sales: " + max);

        // Close scanner
        sc.close();
    }
}