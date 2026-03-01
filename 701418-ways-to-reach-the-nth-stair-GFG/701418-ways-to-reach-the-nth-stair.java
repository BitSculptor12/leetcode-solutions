class Solution {
    int ways(int n,int dp[]){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] =ways(n-1,dp)+ways(n-2,dp);
    }
    int countWays(int n) {
        // your code here
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return ways(n,dp);
    }
}
