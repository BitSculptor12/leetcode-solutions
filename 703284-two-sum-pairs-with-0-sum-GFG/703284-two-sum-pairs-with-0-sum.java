// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int l=0,h= n-1;
        while(l<h){
            int sum = arr[l]+arr[h];
            if(sum==0){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[l]);
                list.add(arr[h]);
                // Collections.sort(list);
                ans.add(list);
                while(l<h&&arr[l]==arr[l+1]) l++;
                while(l<h&&arr[h]==arr[h-1]) h--;
                l++;
                h--;
            }
            else if(sum<0) l++;
            else h--;
        }
        return ans;
    }
}
