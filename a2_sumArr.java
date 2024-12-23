public class a2_sumArr {

    public static void main(String[] args) {
        int arr[] = {7,5,3,5,1 };
        int ans = sum(arr);
        System.out.println(ans);
    }

    public static int sum(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}