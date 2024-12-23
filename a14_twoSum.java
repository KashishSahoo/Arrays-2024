import java.util.*;

public class a14_twoSum  {
    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSum1(n, arr, target);
        System.out.println("This is the answer: [" + ans[0] + ", "
                + ans[1] + "]");
    }

    public static int[] twoSum1(int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static int[] twoSum2(int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(arr[i], i);
        }
        return ans;
    }

    public static String twoSum3(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target)
                left++;
            else
                right--;
        }
        return "NO";
    }

}
