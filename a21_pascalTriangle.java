import java.util.*;

public class a21_pascalTriangle {
  public static void main(String[] args) {
    // ArrayList<List<Integer>> ans = pascalTriangleCons(5);
    // for (List<Integer> it : ans) {
    //   for (int el : it) {
    //     System.out.print(el + " ");
    //   }
    //   System.out.println();
    int ans=calNthRow(5);
    System.out.println(ans);
    }
  

  public static long CalnCr(int n, int r) {
    long result = 1;
    for (int i = 0; i < r; i++) {
      result = result * (n - i);
      result = result / (i + 1);
    }
    return result;
  }

  public static ArrayList<Integer> Calrow(int r) {
    int ans = 1;
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(ans);
    for (int col = 1; col < r; col++) {
      ans = ans * (r - col);
      ans = ans / col;
      answer.add(ans);
    }
    return answer;
  }

  public static int calNthRow(int n){
    int ans=(int)(Math.pow(2, n-1));
    return ans;
  }

  public static ArrayList<List<Integer>> pascalTriangleCons(int n) {
    ArrayList<List<Integer>> ans = new ArrayList<>();
    for (int row = 1; row <= n; row++) {
      ans.add(Calrow(row));
    }
    return ans;
  }
}
