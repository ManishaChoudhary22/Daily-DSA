package Array;

import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {

    // Function to find the second largest element in the array
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        int n = arr.length;
        int largest = arr[n - 1]; // Largest element

        // Traverse from the second last element backwards
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i]; // Return the second largest
            }
        }

        // If all elements are same, return -1
        return -1;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        secondlargest solution = new secondlargest();
        int secondLargest = solution.getSecondLargest(arr);

        if (secondLargest != -1) {
            System.out.println("Second Largest Element: " + secondLargest);
        } else {
            System.out.println("No second largest element exists.");
        }

        sc.close();
    }
}

