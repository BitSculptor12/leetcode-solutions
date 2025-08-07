class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int count1=0;
        int count2=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) continue;
            if(nums[i]<0){
             count1++;
            }
            else{
                count2++;
            }
             res =Math.max(count1,count2);
        }
        return res;
    }
}