import java.util.ArrayList;

public class a8_moveZerosToEnd {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp.add(arr[i]);
        }
        int nz = temp.size();
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }

    }
    public void moveZeroesOP(int[] a) {
        int j = -1;
        int n=a.length;
      //place the pointer j:
      //j at zero always
      //i postive no always
      for (int i = 0; i < n; i++) {
          if (a[i] == 0) {
              j = i;
              break;
          }
      }

      //no non-zero elements:
      if (j == -1) return ;

      //Move the pointers i and j
      //and swap accordingly:
      for (int i = j + 1; i < n; i++) {
          if (a[i] != 0) {
              //swap a[i] & a[j]:
              int tmp = a[i];
              a[i] = a[j];
              a[j] = tmp;
              j++;
          }
      }
  }

}
