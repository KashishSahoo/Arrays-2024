public class a1_largest {

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 11, 24, 22, 1, 13 };
        int ans = largest(arr);
        System.out.println(ans);
    }

    public static int largest(int arr[]) {
        int n = arr.length;
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }
}