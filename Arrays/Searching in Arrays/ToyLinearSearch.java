/*
Problem: Find a Toy Using Linear Search

Description:
Search for a toy ID in the warehouse inventory
using the Linear Search technique.

Approach:
1. Store toy IDs in an array
2. Traverse the array from beginning to end
3. Compare each toy ID with the target toy ID
4. If found, return its position
5. Otherwise print "Toy not found"

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class ToyLinearSearch {

    // Function for linear search
    public static int linearSearch(int[] toyIDs, int targetToyID) {

        for (int i = 0; i < toyIDs.length; i++) {

            if (toyIDs[i] == targetToyID) {
                return i + 1; // 1-indexed position
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of toys in the warehouse
        int n = sc.nextInt();

        int[] toyIDs = new int[n];

        // Input toy IDs
        for (int i = 0; i < n; i++) {
            toyIDs[i] = sc.nextInt();
        }

        // Input target toy ID
        int targetToyID = sc.nextInt();

        // Call linear search function
        int position = linearSearch(toyIDs, targetToyID);

        // Print result
        if (position != -1) {
            System.out.println("Toy found at position: " + position);
        } else {
            System.out.println("Toy not found");
        }

        // Close scanner
        sc.close();
    }
}