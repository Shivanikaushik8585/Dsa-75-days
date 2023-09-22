import java.util.*;

public class BinarySrc {
    public static int Src(int arr[], int key) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int last = arr.length - 1;
            while (start <= last) {
                int mid = (start + last) / 2;
                if (arr[mid] == key) {
                    return mid;
                }
                if (arr[mid] < key) {
                    start++;
                } else {
                    last--;
                }
            }
        }
        return -1;
    }
}
