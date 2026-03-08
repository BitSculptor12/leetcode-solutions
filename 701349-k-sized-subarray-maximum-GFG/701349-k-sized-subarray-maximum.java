class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int nse[] = new int[n];

        st.push(n-1);
        nse[n-1] = n;

        for(int i = n-2; i >= 0; i--){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();

            st.push(i);
        }

        int j = 0;

        for(int i = 0; i <= n-k; i++){

            if(j < i) j = i;

            int max = arr[j];

            while(nse[j] < i + k){
                j = nse[j];
                max = arr[j];
            }

            ans.add(max);
        }

        return ans;
    }
}