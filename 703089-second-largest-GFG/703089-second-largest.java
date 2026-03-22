class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int maxi =-1;
        int sec =-1;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                sec = maxi;
                maxi = arr[i];
            }
            else if(arr[i]>sec&&arr[i]!=maxi){
                    sec = arr[i];
                }
            
            
            
        }
        return sec;
    }
}