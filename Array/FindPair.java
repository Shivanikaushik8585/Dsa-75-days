import java.util.*;
/*Given an array arr[] of distinct elements size N that is sorted and then rotated around an unknown point, the task is to check if the array has a pair with a given sum X.

Examples : 

Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
Output: true */

public class FindPair {
    public static boolean Solution(int arr[], int sum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;

                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = { 11, 15, 6, 8, 9, 10 };
        System.out.print(Solution(arr, 16));

    }

}
