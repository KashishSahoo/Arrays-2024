public class a3_isSorted {

    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 9, 10 };
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    public static boolean isSorted(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                // till here array is sorted
            } else {
                // not sorted
                return false;
            }

        }
        return true;
    }
}