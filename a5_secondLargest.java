import java.util.Arrays;

public class a5_secondLargest {
    public static void main(String[] args) {
      int arr[]={1,2,4,7,7,5};
      int sec=SecondLargestBrute(arr);
            System.out.println(sec);
      
          }
      
          public static int SecondLargestBrute(int[] arr) {
       
        Arrays.sort(arr);
        int n = arr.length;
        int sec = Integer.MIN_VALUE;
        int flag = 0;
        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                sec = arr[i];
                flag = 1;
                break;

            }
        }
        if (flag == 0) {
            sec = -1;
        }
        return sec;
    }
    public int SecondLargestBetter(int[] arr) {
        int lar=arr[0];
        int secLar=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secLar && arr[i]!=lar){
                secLar=arr[i];
            }
        }
        return secLar;
       
    }
    public static int secondLargest(int arr[],int n){
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(sLargest!=largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
    public static int secondSmallest(int arr[],int n){
        int smallest=Integer.MAX_VALUE;
        int ssmallest=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(ssmallest!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
}
