import java.util.*;

public class a23_majorityEle2 {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 1, 3, 1, 4, 5, 6 };
        ArrayList<Integer> ans = new ArrayList<>();
        ans = majorityElement(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> majorityElement(int[] arr) {
        int n = arr.length; // size of the array
        ArrayList<Integer> ls = new ArrayList<>(); // list of answers

        for (int i = 0; i < n; i++) {
            
            if (ls.size() == 0 || ls.get(0) != arr[i]) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        cnt++;
                    }
                }

                if (cnt > (n / 3))
                    ls.add(arr[i]);
            }

            if (ls.size() == 2)
                break;
        }

        return ls;
    }
    public static List<Integer> majorityElement2(int []arr) {
        int n = arr.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // least occurrence of the majority element:
        int mini = (int)(n / 3) + 1;

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);

            //checking if v[i] is
            // the majority element:
            if (mpp.get(arr[i]) == mini) {
                ls.add(arr[i]);
            }
            if (ls.size() == 2) break;
        }

        return ls;
    }
    public static List<Integer> majorityElement3(int []arr) {
        int n = arr.length; //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != arr[i]) {
                cnt1 = 1;
                el1 = arr[i];
            } else if (cnt2 == 0 && el1 != arr[i]) {
                cnt2 = 1;
                el2 = arr[i];
            } else if (arr[i] == el1) cnt1++;
            else if (arr[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el1) cnt1++;
            if (arr[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }


}
