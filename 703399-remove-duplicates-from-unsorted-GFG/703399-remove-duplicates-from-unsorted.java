class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna