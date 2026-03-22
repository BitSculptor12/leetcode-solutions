// User function Template for Java

class Solution {
    public int longestSubarray(int[] nums, int k) {
        // code here
        int n = nums.length;
        int sum =0;
        int maxi = 0;
        int l=0;
        
        HashMap<Integer,Integer> map  =new HashMap<>();
        map.put(0,-1);
        for(int r=0;r<n;r++){
            sum +=nums[r];
            if(map.containsKey(sum-k)){
                int len= r-map.get(sum-k);
                maxi = Math.max(maxi,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,r);
            }
            
        }
        return maxi;
    }
}
