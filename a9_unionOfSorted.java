import java.util.ArrayList;
import java.util.HashSet;

public class a9_unionOfSorted {
    public static void main(String args[]) {
        int arr1[] = { 1,1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> Union =FindUnion(arr1, arr2,n,m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } 
            else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
   

    static ArrayList<Integer> union(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set.add(arr2[i]);
        }
       

        ArrayList<Integer> arr = new ArrayList<>();
        for (int el : set) {
           arr.add(el);
        }
      return arr;

        
    }
}
