class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> pq = new ArrayDeque<>();
        int l=0;
        for(int r=0;r<n;r++){
            if(arr[r]<0) pq.add(arr[r]);
            if(r-l+1==k){
                if(pq.isEmpty()) list.add(0);
                else{
                    list.add(pq.peek());
                }
                if(!pq.isEmpty()&&arr[l]==pq.peek()) {
                    pq.remove();
                }
                l++;
            }
            
        }
        return list;
    }
}