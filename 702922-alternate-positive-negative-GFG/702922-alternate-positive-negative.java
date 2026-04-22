class Solution {
    void rearrange(ArrayList<Integer> arr) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int val : arr){
            if(val >= 0) pos.add(val);
            else neg.add(val);
        }
        
        int n = arr.size();
        int[] brr = new int[n];
        
        int p = 0, ne = 0, i = 0;
        
        // alternate (start with positive)
        while(p < pos.size() && ne < neg.size()){
            brr[i++] = pos.get(p++);
            brr[i++] = neg.get(ne++);
        }
        
        // remaining positives (AS IT IS)
        while(p < pos.size()){
            brr[i++] = pos.get(p++);
        }
        
        // remaining negatives (AS IT IS)
        while(ne < neg.size()){
            brr[i++] = neg.get(ne++);
        }
        
        for(int j = 0; j < n; j++){
            arr.set(j, brr[j]);
        }
    }
}