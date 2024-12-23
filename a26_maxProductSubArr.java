public class a26_maxProductSubArr {
    public static void main(String[] args) {
        int nums[] = { 3,2,-1,4,-6,3,-2,6 };
        int answer = maxProductSubArray(nums);
        System.out.print("The maximum product subarray is: " + answer);
    }

    static int maxProductSubArray(int arr[]) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i; j < arr.length; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++)
                    prod *= arr[k];
                result = Math.max(result, prod);
            }
        return result;
    }
    public static int subarrayWithMaxProduct(int []arr){
      
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
               prod=prod*arr[j];
                maxi=Math.max(maxi,prod);
            }       
        }
        return maxi;
    }
    public static int maxProductSubArray3(int[] arr) {
        int n = arr.length; 
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }

}
