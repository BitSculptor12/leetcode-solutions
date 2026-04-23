class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int maxi =1;
        for(int ele:arr){
            if(!set.contains(ele-1)){
                int curr =ele;
                int len =1;
                while(set.contains(curr)){
                    curr++;
                    len++;
                }
                maxi = Math.max(maxi,len);
            }
        }
        return maxi-1;
    }
}