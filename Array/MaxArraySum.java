public class MaxArraySum {
    /*
     * Given an integer array nums, find the
     * subarray
     * with the largest sum, and return its sum.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     * Example 2:
     * 
     * Input: nums = [1]
     * Output: 1
     * Explanation: The subarray [1] has the largest sum 1.
     */
    public static int solution(int nums[]) {
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(max, cs);
        }
        return max;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.print(solution(nums));

    }
}
