// User function Template for Java

class Solution {
    void helper(String s,List<String> ans,StringBuilder vt,int i){
       if(i==s.length()){ 
           if(vt.length()>0)ans.add(vt.toString());
           return;
       }
        vt.append(s.charAt(i));
        helper(s,ans,vt,i+1);
        vt.deleteCharAt(vt.length()-1);
        helper(s,ans,vt,i+1);
        
    }
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        helper(s,ans,new StringBuilder(),0);
        Collections.sort(ans);
        return ans;
    }
}