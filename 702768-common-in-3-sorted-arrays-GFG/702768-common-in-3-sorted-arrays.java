class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> res = new ArrayList<>();
        
        while(i < a.length && j < b.length && k < c.length){
            
            if(a[i] == b[j] && b[j] == c[k]){
                if(res.size() == 0 || res.get(res.size()-1) != a[i]){
                    res.add(a[i]);
                }
                i++; j++; k++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < c[k]){
                j++;
            }
            else{
                k++;
            }
        }
        
        return res;
    }
}