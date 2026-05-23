/*
Problem: Binary Search for Student Name

Description:
Search for a particular student name in a sorted array
using Binary Search.

Approach:
1. Store student names in sorted order
2. Compare the middle element with the target name
3. If matched, return index
4. If target is smaller, search left half
5. Otherwise search right half

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class BinarySearchStudent {

    // Function for binary search
    public static int binarySearch(String[] students, String target) {

        int low = 0;
        int high = students.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = students[mid].compareTo(target);

            // Student found
            if (result == 0) {
                return mid;
            }

            // Search in right half
            else if (result < 0) {
                low = mid + 1;
            }

            // Search in left half
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter number of students:");

        int n = sc.nextInt();
        sc.nextLine();

        // Create student array
        String[] students = new String[n];

        // Input student names
        System.out.println("Enter student names in sorted order:");

        for (int i = 0; i < n; i++) {
            students[i] = sc.nextLine();
        }

        // Input target student name
        System.out.println("Enter student name to search:");

        String target = sc.nextLine();

        // Call binary search function
        int index = binarySearch(students, target);

        // Print result
        if (index != -1) {
            System.out.println("Student found at index: " + index);
        } else {
            System.out.println("Student not found");
        }

        // Close scanner
        sc.close();
    }
}