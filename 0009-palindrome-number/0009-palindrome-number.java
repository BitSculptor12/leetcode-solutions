class Solution {
    public boolean isPalindrome(int x) {
        int rem,rev=0,n1;
        n1=x;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        System.out.println(rev);
        if(rev==n1){
            // System.out.println("it is a pallindrome");
            return true;
        }
        else{
            // System.out.println("it is not pallindrome");
            return false;
        }
    }
}