class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int l=0,h=n-1;
        int lb = -1;
        while(l<=h){
            int mid =l+(h-l)/2;
            if(arr[mid]<=x){
                lb = mid;
                l= mid+1;
            }
            else{
                h =mid-1;
            }
        }
        return lb;
    }
}
