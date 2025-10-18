class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];  // update buying price
            } else {
                int profit = arr[i] - minPrice;  // sell at current price
                maxProfit = Math.max(maxProfit, profit);  // update max profit
            }
        }

        return maxProfit;
    }
}
