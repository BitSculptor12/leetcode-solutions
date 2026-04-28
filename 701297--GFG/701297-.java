class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        String txt = s2+s2;
        int n  =txt.length();
        int lps[]=toComput(s1);
        int i=0;
        int j=0;
        // int n = txt.length();
        while(i<n){
            if(s1.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==s1.length()) return true;
            else if(i<n&&s1.charAt(j)!=txt.charAt(i)){
                if(j!=0) j=lps[j-1];
                else{
                    i++;
                }
            }
        }
        return false;
    }
    public int[] toComput(String s){
        int m = s.length();
        int lps[] = new int[m];
        int i=1;
        int len =0;
        while(i<m){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0) len = lps[len-1];
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}