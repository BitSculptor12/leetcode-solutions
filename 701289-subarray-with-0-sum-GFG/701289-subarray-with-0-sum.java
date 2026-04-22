class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
            if(sum==0) return true;
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
        
    }
}