import java.util.Arrays;

public class a15_sort012s {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        // [00001111222]
        int n = arr.length;
        sortAllOp(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    static void sortAllBrute(int arr[], int n) {
        int cnt0 = 0;
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt0++;
            }
            if (arr[i] == 1) {
                cnt1++;
            }

        }
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < n; i++) {
            arr[i] = 2;
        }
    }

    static void sortAllOp(int arr[], int n) {

        int low = 0;
        int mid = 0;
        int high = n - 1;
        int temp = 0;

        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

    }
}
