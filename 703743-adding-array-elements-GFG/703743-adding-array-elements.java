class Solution {
    int minOperations(int[] arr, int n, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr) {
            pq.add(ele);
        }

        int count = 0;

        while(pq.size() > 1 && pq.peek() < k) {

            int v1 = pq.poll();
            int v2 = pq.poll();

            pq.add(v1 + v2);

            count++;
        }

        if(pq.peek() >= k) return count;

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna