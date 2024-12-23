public class a12_maxConsecOnes {
    public static void main(String[] args) {
        
    }
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int ones=0;
        int maxOnes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                ones++;
            }
            else{
            ones=0;
            }
             maxOnes = Math.max(maxOnes, ones);
         
        }
        return maxOnes;
    }
}
