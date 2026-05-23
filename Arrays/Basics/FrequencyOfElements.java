/*
Problem: Frequency of Elements in an Array

Description:
Read array elements and print the frequency of each element.

Approach:
Use a visited array to track already counted elements.

Time Complexity: O(n²)
Space Complexity: O(n)
*/

import java.util.*;

public class FrequencyOfElements {

    public static void main(String[] args) {

        // int arr[] = {1, 2, 2, 3, 4, 4};
        // Arrays.sort(arr);
        // int count = 1;
        // for (int i = 0; i < arr.length; i++) {
        //     if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
        //         count++;
        //     } else {
        //         System.out.println(arr[i] + " occurs " + count + " times");
        //         count = 1;
        //     }
        // }

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {

            if (visited[i] == 1) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }

        sc.close();
    }
}