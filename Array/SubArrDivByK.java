public class SubArrDivByK {
    /*
     * Given an arr[] containing n integers and a positive integer k. The problem is
     * to find the longest subarray’s length with the sum of the elements divisible
     * by the given value k.
     * 
     * Examples:
     * 
     * Input: arr[] = {2, 7, 6, 1, 4, 5}, k = 3
     * Output: 4
     */
    public static int Solution(int arr[], int k) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + i; j < arr.length; j++) {
                sum += arr[j];
                if ((sum % k) == 0) {
                    max = Math.max(max, j - i + 1);

                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 2, 7, 6, 1, 4, 5 };
        int k = 3;
        System.out.print(Solution(arr, k));

    }

}
