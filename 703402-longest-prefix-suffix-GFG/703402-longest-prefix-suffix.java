class Solution {
    private int[] toCompute(String s){
        int m =s.length();
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
    int getLPSLength(String s) {
        // code here
       int n = s.length();
       int lps[]=toCompute(s);
       int maxi =0;
       int count =0;
    //   for(int i=0;i<n;i++){
           
    //       if(lps[i]>0){
    //           count++;
    //       }
    //       else{
    //           maxi = Math.max(maxi,count);
    //           count =1;
    //       }
    //   }
    //   return maxi;
    return lps[n-1];
    }
}