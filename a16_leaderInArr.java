import java.util.ArrayList;
import java.util.Collections;

public class a16_leaderInArr {
  public static void main(String[] args) {
    int arr[] = { 10, 22, 12, 3, 0, 6 };
    ArrayList<Integer> ans = printLeadersOP(arr,arr.length);
    System.out.println(ans);
  }

  public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {

    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      boolean leader = true;

      // Checking whether arr[i] is greater than all
      // the elements in its right side
      for (int j = i + 1; j < n; j++)
        if (arr[j] > arr[i]) {

          // If any element found is greater than current leader
          // curr element is not the leader.
          leader = false;
          break;
        }

      // Push all the leaders in ans array.
      if (leader)
        ans.add(arr[i]);

    }

    return ans;

  }

  public static ArrayList<Integer> leaderOP(int arr[]) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] > max) {
        max = arr[i];
        ans.add(arr[i]);
      }
    }
    return ans;

  }

  public static ArrayList<Integer> printLeadersOP(int[] arr, int n) {

    ArrayList<Integer> ans = new ArrayList<>();

    // Last element of an array is always a leader,
    // push into ans array.
    int max = arr[n - 1];

    ans.add(arr[n - 1]);

    // Start checking from the end whether a number is greater
    // than max no. from right, hence leader.
    for (int i = n - 2; i >= 0; i--)
      if (arr[i] > max) {
        ans.add(arr[i]);
        max = arr[i];
      }
    Collections.reverse(ans);
    return ans;

  }

}
