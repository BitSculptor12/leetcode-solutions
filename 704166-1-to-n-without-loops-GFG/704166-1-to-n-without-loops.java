class Solution {
    public static void rec(int N){
        if(N==0) return;
        rec(N-1);
        System.out.print(N+" ");
    }
    static void printTillN(int N) {
        // code here
        rec(N);
    }
}