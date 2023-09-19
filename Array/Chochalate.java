import java.util.Arrays;

public class Chochalate {
    /*
     * Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
     * Output: Minimum Difference is 2
     * Explanation:
     * We have seven packets of chocolates and we need to pick three packets for 3
     * students
     * If we pick 2, 3 and 4, we get the minimum difference between maximum and
     * minimum packet sizes.
     * 
     * Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
     * Output: Minimum Difference is 6
     * 
     */

    public static int solution(int arr[], int m) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length - 1;
        if (n < m) {
            return -1;

        }
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            min = Math.min(min, diff);
        }

        return min;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int m = 5;
        System.out.print(solution(arr, m));

    }

}
