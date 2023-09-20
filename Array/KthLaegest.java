import java.util.*;

public class KthLaegest {

    public static int Solution(int arr[], int k) {

        Arrays.sort(arr);

        int lar = 0;
        int n = arr.length;
        for (int i = n; i >= 0; i--) {
            if (k == i) {
                lar = n - i;

            }
        }
        return arr[lar];
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 3, 2, 1, 5, 6, 4 };
        System.out.print(Solution(arr, 2));

    }
}
