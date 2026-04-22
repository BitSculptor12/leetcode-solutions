
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        int n = a.length;
        int m  = b.length;
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<n;i++){
            set.put(a[i],set.getOrDefault(a[i],0)+1);
        }
        int count =0;
        for(int i=0;i<m;i++){
            if(!set.containsKey(b[i])||set.get(b[i])==0) return false;
            set.put(b[i],set.get(b[i])-1);
        }
        return true;
    }
}
