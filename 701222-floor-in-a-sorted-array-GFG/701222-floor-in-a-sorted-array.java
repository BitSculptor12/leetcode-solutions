class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int l=0,h = n-1;
        int ub = n;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]>x){
                ub = Math.min(ub,mid);
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ub-1;
    }
}
