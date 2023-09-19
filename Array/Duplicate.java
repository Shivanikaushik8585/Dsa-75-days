
import java.util.Arrays;

public class Duplicate {

    /*
     * Given an integer array nums, return true if any value appears at least twice
     * in the array, and return false if every element is distinct.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3,1]
     * Output: true
     * Example 2:
     * 
     * Input: nums = [1,2,3,4]
     * Output: false
     * Example 3:
     */

    public static boolean solution(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 2, 6, 1, 7, 2 };
        System.out.print(solution(arr));

    }

}
