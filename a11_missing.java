public class a11_missing {
    public static void main(String[] args) {
        
    }
    public static int missingNumber(int []arr, int n) {
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
    public static int missingNumber2(int []arr, int n) {
        int hash[]=new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]]=1;
        }
        for(int i=1;i<hash.length;i++){
            if(hash[i]!=1){
                return i;
            }
        }
        return -1;
    }
    public static int missingNumber3(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
    public static int missingNumber4(int []a, int N) {
        // Write your code here.
        
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2);

    }
    
}
