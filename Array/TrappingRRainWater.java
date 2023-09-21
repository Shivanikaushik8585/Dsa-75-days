public class TrappingRRainWater {
    /*
     * Given n non-negative integers representing an elevation map where the width
     * of each bar is 1, compute how much water it can trap after raining.
     * 
     * 
     * 
     * Example 1:
     * 
     * 
     * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * Output: 6
     */

    public static int Solution(int arr[]) {
        int trap = 0;
        int n = arr.length;
        int left[] = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);

        }
        int right[] = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);

        }
        for (int i = 0; i < n; i++) {
            int level = Math.min(left[i], right[i]);
            trap += level - arr[i];

        }
        return trap;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        System.out.print(Solution(arr));

    }
}
