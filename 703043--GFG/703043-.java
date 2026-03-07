// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum =0;
        int maxi=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum +=arr[i];
            if(map.containsKey(sum-k)){
                int len = i-map.get(sum-k);
                maxi =Math.max(maxi,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxi;
    }
}
