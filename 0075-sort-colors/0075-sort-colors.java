
//2nd method
class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int noOfZeros = 0;
        int noOfOnes = 0;
        int index = 0;

        // Count 0s and 1s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                noOfZeros++;
            } else if (arr[i] == 1) {
                noOfOnes++;
            }
        }

        // Fill 0s
        for (int i = 0; i < noOfZeros; i++) {
            arr[index++] = 0;
        }

        // Fill 1s
        for (int i = 0; i < noOfOnes; i++) {
            arr[index++] = 1;
        }

        // Fill 2s (remaining elements)
        for (int i = index; i < n; i++) {
            arr[index++] = 2;
        }
    }
}
