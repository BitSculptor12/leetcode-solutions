class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(i>0&&arr[i]==arr[i-1]) continue;
            int l = i+1;
            int h = n-1;
            while(l<h){
                int sum =arr[i]+arr[l]+arr[h];
                if(sum==target){
                    return true;
                    
                }
                if(sum<target){
                    l++;
                }
                else {
                    h--;
                }
            }
        }
        return false;
    }
}
