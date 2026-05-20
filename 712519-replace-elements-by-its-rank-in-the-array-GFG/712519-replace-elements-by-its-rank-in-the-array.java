class Solution {
    static int[] replaceWithRank(int arr[], int N) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int brr[] = Arrays.copyOf(arr, N);

        Arrays.sort(brr);

        int rank = 1;

        for(int i=0;i<N;i++){

            if(!map.containsKey(brr[i])){
                map.put(brr[i], rank++);
            }
        }

        int ans[] = new int[N];

        for(int i=0;i<N;i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna