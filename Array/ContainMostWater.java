public class ContainMostWater {
    /*
     * You are given an integer array height of length n. There are n vertical lines
     * drawn such that the two endpoints of the ith line are (i, 0) and (i,
     * height[i]).
     * 
     * Find two lines that together with the x-axis form a container, such that the
     * container contains the most water.
     * 
     * Return the maximum amount of water a container can store.
     * 
     * Notice that you may not slant the container.
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     */
    public static int Solution(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int ht = Math.min(arr[i], arr[j]);
                int width = j - i;
                int curr = ht * width;
                max = Math.max(max, curr);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.print(Solution(arr));
    }

}
