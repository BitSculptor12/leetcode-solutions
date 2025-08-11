class Solution {
    public double average(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        int n = arr.length;
        // int brr[] = new int[n];
        // int z=;
        int sum =0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
            max = arr[i];
            }
        }
        
       for(int i=0;i<n;i++){
        if(arr[i]!=min&&arr[i]!=max){
          sum=sum+arr[i];
        }
        }
       return (sum)/(double)(n-2);
    }
}