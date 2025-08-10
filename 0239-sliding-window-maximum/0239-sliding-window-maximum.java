class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        Stack<Integer> st = new Stack<>();
        int nse[] = new int[n];

        st.push(n - 1);
        nse[n - 1] = n;

        int z = 0;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] >= nums[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        int j = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (j >= i + k) j = i;
            int max = nums[j];
            while (j < i + k) {
              
                max = nums[j];
                j = nse[j];
            }
            ans[z++] = max;
        }
        return ans;
    }
}
