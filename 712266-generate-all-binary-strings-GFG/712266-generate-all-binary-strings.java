class Solution {
    
    void helper(int n, ArrayList<String> list, String str) {
        if (str.length() == n) {
            list.add(str);
            return;
        }
        
        helper(n, list, str + "0");
        helper(n, list, str + "1");
    }
    
    public ArrayList<String> binstr(int n) {
        ArrayList<String> list = new ArrayList<>();
        helper(n, list, "");
        return list;
    }
}