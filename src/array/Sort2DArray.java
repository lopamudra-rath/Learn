package array;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        // Example 2D array
        int[][] twoDArray = {
                {5, 2, 9},
                {1, 8, 4},
                {3, 7, 6}
        };

        // Sort the 2D array based on the first column
        Arrays.sort(twoDArray, Comparator.comparingInt(arr -> arr[0]));

        // Sort the 2D array based on the first column and then the second column
        Arrays.sort(twoDArray, Comparator
                .comparingInt((int[] arr) -> arr[0])
                .thenComparingInt(arr -> arr[1])
        );

        // Display the sorted 2D array
        for (int[] row : twoDArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
