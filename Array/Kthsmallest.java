import java.util.*;
/*
 * Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
 */

public class Kthsmallest {
    public static int Solution(int arr[], int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == k) {
                return arr[i - 1];

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 2, 1, 6, 5, 28 };
        System.out.print(Solution(arr, 4));

    }

}
