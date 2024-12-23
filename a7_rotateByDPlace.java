public class a7_rotateByDPlace {
  public static void Rotatetoleft(int[] arr, int n, int d) {
    d = d % n;
    int[] temp = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    for (int i = d; i < n; i++) {
      arr[i-d] = arr[i];
    }
    for (int i = n - d; i < n; i++) {
      arr[i] = temp[i-n+d];
      
    }
  }
  public static void leftRotateArr(int arr[],int n,int d){
    if(n==0){
        return;
    }
    d=d%n;
    rev(arr,0,d-1);
    rev(arr,d,n-1);
    rev(arr,0,n-1);
}
public static void rev(int arr[],int s,int e){
    while (s<=e) {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
}
  
  public static void main(String args[]) {
    int n = 7;
    int[] arr = {1,2,3,4,5,6,7};
    // 321 7654
    // 4567123
    int d = 3;
    // reverse(arr);
    leftRotateArr(arr, n, d);
    System.out.println("After Rotating the elements to left ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
