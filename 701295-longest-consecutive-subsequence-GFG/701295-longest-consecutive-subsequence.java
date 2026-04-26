class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int maxlen = 0;
        for(int ele:arr){
            int len =0;
            if(!set.contains(ele-1)){
                int curr = ele;
                while(set.contains(curr)){
                    curr++;
                    len++;
                }
            }
            maxlen = Math.max(maxlen,len);
        }
        return maxlen;
    }
}