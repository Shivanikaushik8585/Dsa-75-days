public class NextPermutation {
    /*
     * A permutation of an array of integers is an arrangement of its members into a
     * sequence or linear order.
     * 
     * For example, for arr = [1,2,3], the following are all the permutations of
     * arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
     * The next permutation of an array of integers is the next lexicographically
     * greater permutation of its integer. More formally, if all the permutations of
     * the array are sorted in one container according to their lexicographical
     * order, then the next permutation of that array is the permutation that
     * follows it in the sorted container. If such arrangement is not possible, the
     * array must be rearranged as the lowest possible order (i.e., sorted in
     * ascending order).
     * 
     * For example, the next permutation of arr = [1,2,3] is [1,3,2].
     * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
     * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does
     * not have a lexicographical larger rearrangement.
     * Given an array of integers nums, find the next permutation of nums.
     * 
     * The replacement must be in place and use only constant extra memory.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3]
     * Output: [1,3,2]
     */
    public static void Solution(int arr[]) {
        int n = arr.length - 1;
        int i = n - 1;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n;
            while (j <= 0 && arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1, n);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 3, 1, 2 };
        Solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
