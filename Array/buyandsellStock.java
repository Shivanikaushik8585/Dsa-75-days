public class buyandsellStock {
    /*
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * 
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * 
     * Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
     * 6-1 = 5.
     */
    public static int Solution(int arr[]) {
        int bp = Integer.MAX_VALUE;
        int mp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (bp < arr[i]) {
                int profit = arr[i] - bp;
                mp = Math.max(profit, mp);
            } else {
                bp = arr[i];
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print(Solution(arr));
    }

}
