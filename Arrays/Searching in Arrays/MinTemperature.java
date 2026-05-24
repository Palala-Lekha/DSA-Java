/*
Problem: Find Minimum Temperature

Description:
Read temperature values from the user and
find the minimum temperature in the array.

Approach:
1. Store all temperatures in an array
2. Assume first element as minimum
3. Traverse the array
4. Update minimum value whenever a smaller element is found

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class MinTemperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of temperatures
        System.out.println("Enter the number of temperatures:");

        int n = sc.nextInt();

        int[] temperatures = new int[n];

        // Input temperature values
        System.out.println("Enter the temperatures:");

        for (int i = 0; i < n; i++) {
            temperatures[i] = sc.nextInt();
        }

        // Assume first element as minimum
        int min = temperatures[0];

        // Find minimum temperature
        for (int i = 1; i < n; i++) {

            if (temperatures[i] < min) {
                min = temperatures[i];
            }
        }

        // Print minimum temperature
        System.out.println("The minimum temperature is: " + min);

        // Close scanner
        sc.close();
    }
}