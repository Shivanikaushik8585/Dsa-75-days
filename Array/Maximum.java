public class Maximum {
    // Given an array of size N. The task is to find the maximum and the minimum
    // element of the array using the minimum number of comparisons.
    /*
     * Examples:
     * 
     * Input: arr[] = {3, 5, 4, 1, 9}
     * Output: Minimum element is: 1
     * Maximum element is: 9
     * 
     * Input: arr[] = {22, 14, 8, 17, 35, 3}
     * Output: Minimum element is: 3
     * Maximum element is: 35
     */

    public static void Solution(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Maximum element:" + max);
        System.out.println("Minimum element :" + min);

    }
}