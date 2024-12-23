import java.util.Arrays;

public class a6_leftRotOnePlace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotateOne(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void rotateOne(int arr[]){
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
}
