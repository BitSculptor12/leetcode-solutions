class Solution {
    int floorSqrt(int n) {
        // code here
        int l=0,h=n-1;
        if(n==1) return 1;
        int lb = 0;
        while(l<=h){
            int mid =l+(h-l)/2;
            if(mid!=0&&mid*mid<=n){
                lb = mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        return lb;
    }
}