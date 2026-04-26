class Solution {
    static int mergeSort(int arr[],int l,int mid, int h){
        int temp[] = new int[h-l+1];
        int count =0;
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=h){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
                count +=mid-i+1;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=h){
            temp[k++]=arr[j++];
        }
        for(int x=0;x<temp.length;x++){
            arr[x+l]=temp[x];
        }
        return count;
        
    }
    static int merge(int arr[],int l,int h){
        int count =0;
        if(l<h){
            int mid =l+(h-l)/2;
           count +=merge(arr,l,mid);
           count +=merge(arr,mid+1,h);
           count +=mergeSort(arr,l,mid,h);
        }
        return count;
    }
    static int inversionCount(int arr[]) {
        // Code Here
        int n = arr.length;
        return merge(arr,0,n-1);
    }
}