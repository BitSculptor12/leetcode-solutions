class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n  = arr.length;
        int l=0,h=n-1;
        int c=0;
        while(l<h){
            int mid =l+(h-l)/2;
            if(arr[mid]<=arr[h]){
                h =mid;
            }
            else{
                l = mid+1;
                
            }
        }
        return l;
    }
}