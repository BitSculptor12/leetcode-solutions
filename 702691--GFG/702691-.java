// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> curr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int currSum =0;
        int bestSum=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                curr.add(arr[i]);
                currSum +=arr[i];
            }
            else{
                if(currSum>bestSum||((currSum==bestSum)&&curr.size()>ans.size())){
                    ans = new ArrayList<>(curr);
                    bestSum =currSum;
                    
                }
                curr.clear();
                currSum=0;
            }
        }
         if(currSum>bestSum||(currSum==bestSum)&&curr.size()>ans.size()){
                    ans = new ArrayList<>(curr);
            }
            if(ans.size()==0) ans.add(-1);
    return ans;
    }
}