class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int l=0, h= n-1;
        int lb = n;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return lb;
    }
}
