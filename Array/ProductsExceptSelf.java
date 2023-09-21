public class ProductsExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        leftProducts[0] = 1;
        rightProducts[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
            System.out.println("left" + leftProducts[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
            System.out.println("right" + rightProducts[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
            System.out.print(result[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nums[] = { 1, 2, 3, 4 };
        productExceptSelf(nums);
    }
}
