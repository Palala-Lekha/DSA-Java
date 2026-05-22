/*
Problem: Sum of Even and Odd Numbers in an Array

Description:
Read numbers in a single line, store them in an array,
and calculate the sum of even and odd numbers separately.

Approach:
1. Take input as a single line
2. Split the input using spaces
3. Convert String values into integers
4. Traverse the array
5. Add even numbers to evenSum
6. Add odd numbers to oddSum

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input in a single line
        String[] input = scanner.nextLine().split("\\s+");

        // Create array based on input size
        int[] numbers = new int[input.length];

        // Convert String values to integers
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        // Variables to store sums
        int evenSum = 0;
        int oddSum = 0;

        // Traverse array
        for (int num : numbers) {

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        // Print output
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);

        // Close scanner
        scanner.close();
    }
}