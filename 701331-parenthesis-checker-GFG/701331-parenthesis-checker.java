class Solution {
    public boolean isBalanced(String s) {
        // code here
        int n = s.length();
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }
            else if(s.charAt(i)=='{'){
                st.push('}');
            }
            else if(s.charAt(i)=='['){
                st.push(']');
            }
            else{
                if(st.size()==0||st.pop()!=s.charAt(i)) return false;
            }
        }
    //   if(st.size()>0) return false;
       return st.isEmpty();
        
    }
}
