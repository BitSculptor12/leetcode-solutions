class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(n==1) return m;
        if(m==0) return 0;
       
        int l=1, h=m;
        while(l<=h){
            int mid = l+(h-l)/2;
             int val =1;
            for(int i=0;i<n;i++){
                val *= mid;
            }
           if(val==m) return mid;
           else if(val<m){
                l = mid+1;
            }
            else h = mid-1;
        }
        
         return -1;
    }
}