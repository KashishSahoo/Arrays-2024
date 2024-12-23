import java.util.ArrayList;

public class a10_IntersectionOfSorted {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 4, 4, 5, 6, 6, 7 ,8};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = IntersectionArr(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }

    static ArrayList<Integer> Intersection(int arr1[], int arr2[], int n, int m) {

        ArrayList<Integer> ans = new ArrayList<>();
        int visited[] = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    ans.add(arr2[j]);
                    visited[j] = 1;
                    break;
                } else if (arr2[j] > arr1[i])
                    break;

            }
        }
        return ans;
    }
    static ArrayList<Integer> IntersectionArr(int arr1[],int arr2[],int n,int m){
        ArrayList<Integer> ans=new ArrayList<>();

        int i = 0, j = 0; 
      
        // to traverse the arrays
        while (i < arr1.length && j < arr2.length) {
            
          //if current element in i is smaller
          if (arr1[i] < arr2[j]) { 
            i++;
          } else if (arr2[j] < arr1[i]) {
            j++;
          } else {
          
            //both elements are equal
            ans.add(arr1[i]);
            i++;
            j++;
          }
        }
        return ans;
    }
}