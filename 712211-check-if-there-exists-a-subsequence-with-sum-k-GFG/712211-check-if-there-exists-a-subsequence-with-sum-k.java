class Solution {

    static boolean combo(int n,int arr[],int t,int i){

        if(t==0) return true;
        if(i==n || t<0) return false;

        if(combo(n,arr,t-arr[i],i+1)) return true;

        if(combo(n,arr,t,i+1)) return true;

        return false;
    }

    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {

        return combo(N,arr,K,0);

    }
}