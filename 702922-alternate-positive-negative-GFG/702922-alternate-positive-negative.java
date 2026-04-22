class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int val:arr){
            if(val>=0) pos.add(val);
            else neg.add(val);
        }
        int i=0;int p=0,n=0;
        int l = arr.size();
        int brr[] = new int[l];
        while(p<pos.size()&&n<neg.size()){
            brr[i++] =pos.get(p++);
            brr[i++]=neg.get(n++);
        }
        while(p<pos.size()){
            brr[i++]=pos.get(p++);
        }
        while(n<neg.size()){
            brr[i++]=neg.get(n++);
        }
         for(int j = 0; j < l; j++){
            arr.set(j, brr[j]);
        }
    }
}