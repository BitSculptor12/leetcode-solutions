class Solution {

    public static boolean com(int arr[], int target, int i){
        
        if(target == 0) return true;
        
        if(i == arr.length || target < 0) return false;

        // pick
        if(com(arr, target - arr[i], i+1)) return true;

        // not pick
        if(com(arr, target, i+1)) return true;

        return false;
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        return com(arr, sum, 0);
    }
}