class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int l=0,h= n-1;
        int ub =n;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]>target){
                ub = Math.min(ub,mid);
                h =mid-1;
            }
            else l = mid+1;
        }
        return ub;
    }
}
