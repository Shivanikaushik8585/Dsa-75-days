public class MaxProductSubarray {
    /*
     * Given an integer array nums, find a
     * subarray
     * that has the largest product, and return the product.
     * 
     * The test cases are generated so that the answer will fit in a 32-bit integer.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,3,-2,4]
     * Output: 6
     */

    public static int Solution(int arr[]) {
        int product = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
            if (product < 0) {
                product = 1;
            }
            max = Math.max(max, product);
            // System.out.println(max);
        }
        return max;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 2, 3, -2, 4 };
        System.out.print(Solution(arr));

    }

}
