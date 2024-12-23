import java.util.HashMap;
import java.util.Map;

public class a13_singleElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3};
        int ans=getSingleElement4(arr);
        System.out.println(ans);
    }
    public static int getSingleElement(int []arr){
        // Write your code here.
        int n=arr.length;
        int num,cnt;
        for(int i=0;i<n;i++){
            num=arr[i];
            cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    cnt++;
                }
            }
              if (cnt == 1) return num;
        }
        return -1;
    }
    public static int getSingleElement2(int []arr){
        // Write your code here.
        int max=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int hash[]=new int[max+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }
    public static int getSingleElement3(int []arr){
        
        int n = arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
      
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(arr[i],0);
            map.put(arr[i], value+1);
        }

        //Find the single element and return the answer:
      
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;

    }
    public static int getSingleElement4(int []arr){
        int xor=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;
    }

}
