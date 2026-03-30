class Solution {
    public int solve(int n, int i, int prev, int[][] dp){
        if(i == n) return 1;

        if(dp[i][prev] != -1) return dp[i][prev];

        int take0 = solve(n, i + 1, 0, dp);

        int take1 = 0;
        if(prev == 0){
            take1 = solve(n, i + 1, 1, dp);
        }

        return dp[i][prev] = take0 + take1;
    }

    int countStrings(int n) {
        int dp[][] = new int[n][2];

        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(n, 0, 0, dp);
    }
}