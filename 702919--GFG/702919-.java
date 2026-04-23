class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int currMax =arr[0];
        int currMin = arr[0];
        int maxi=arr[0];
        for(int i=1;i<n;i++){
            int temp =currMax;
            currMax = Math.max(arr[i],Math.max(currMax*arr[i],currMin*arr[i]));
            currMin =Math.min(arr[i],Math.min(temp*arr[i],currMin*arr[i]));
            maxi = Math.max(maxi,currMax);
        }
        return maxi;
    }
}