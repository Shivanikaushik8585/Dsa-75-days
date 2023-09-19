public class Reverse {

    /*
     * Given an array (or string), the task is to reverse the array/string.
     * Examples :
     * 
     * 
     * Input : arr[] = {1, 2, 3}
     * Output : arr[] = {3, 2, 1}
     * 
     * Input : arr[] = {4, 5, 1, 2}
     * Output : arr[] = {2, 1, 5, 4}
     */
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        if (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
        first++;
        last--;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 1, 4, 3, 2 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
